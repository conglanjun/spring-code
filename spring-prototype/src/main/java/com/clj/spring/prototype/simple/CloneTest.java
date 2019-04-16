package com.clj.spring.prototype.simple;

/**
 * User: conglanjun
 * Date: 2019/4/16
 * Time: 9:26
 * Description:
 */
public class CloneTest {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        cp.setAge(18);
        cp.setName("Tom");
        try {
            ConcretePrototype copy = (ConcretePrototype) cp.clone();
            System.out.println(cp.list == copy.list);
            System.out.println(copy.getAge() + "," + copy.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
