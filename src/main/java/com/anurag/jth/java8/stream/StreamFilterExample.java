package com.anurag.jth.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "node", "python");
		//filterAndCollect(lines);
		List<Person> persons = Arrays.asList(
                new Person("anurag", 30),
                new Person("jack", 20),
                new Person("lawrence", 40),
                new Person("anurag", 40)
        );
		
	filterFindAnyWithOrElse(persons);

		
		
	}

	private static void filterFindAnyWithOrElse(List<Person> persons) {
		Person personAct = persons.stream().filter(person->"anurag".equals(person.getName())).findAny()
		.orElse(null);
		System.out.println(personAct);
		
	}

	private static void filterAndCollect(List<String> lines) {
		List<String> result = lines.stream().filter(line->!("python").equals(line)).collect(Collectors.toList());
		result.forEach(System.out :: println);
	}
}


 class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    @Override
    public String toString() {
    	return new StringBuilder().append("name :"+name).append(" age :"+age).toString();
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}