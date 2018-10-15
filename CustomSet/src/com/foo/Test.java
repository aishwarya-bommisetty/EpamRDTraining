package com.foo;

/**
 *
 * @author Aishwarya_Bommisetty
 *
 */
public class Test {
    /**
     *
     */
    protected Test() {

    }
/**
 *
 * @param args command line arguments.
 */
public static void main(final String[] args) {
Set<Student> c = new Set<Student>();
c.Add(new Student(1, "raj"));
c.Add(new Student(2, "ravi"));
c.Add(new Student(1, "ram"));
c.Add(new Student(2, "ravi"));
//c.Add(new Student(4, "revathi"));
if (c.Indexer(2) != null) {
    System.out.println(c.Indexer(2));
    }
System.out.println(c);
c.PrintSet();
c.Sort();
System.out.println(c.Find((s) -> s.getRollNo() == 1));
System.out.println(c);
c.Remove((s) -> s.getName().equals("ravi"));
System.out.println(c);
System.out.println(c.Find(new Student(2, "ram")));
System.out.println(c.Find((s) -> s.getRollNo() == 1));
}
}
