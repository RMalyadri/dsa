package com.dpattern;

public class EmpBuilder {

	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	private EmpBuilder(Builder builder) {
          this.name="maly";
          this.age=23;
	}

	public static class Builder {

		public EmpBuilder build() {
			return new EmpBuilder(this);
		}
	}

}
