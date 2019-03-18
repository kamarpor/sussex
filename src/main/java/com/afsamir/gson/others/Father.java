package com.afsamir.gson.others;

public class Father {

    private int age;
    private String name;
    private String lastName;
    private Job job;

    private Father(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.job = builder.job;

    }


    @Override
    public String toString() {
        return "Father{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", job=" + job +
                '}';
    }

    public static class Builder {

        private int age;
        private String name;
        private String lastName;
        private Job job;

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;

        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withJob(Job job) {
            this.job = job;
            return this;
        }

        public Father build() {
            return new Father(this);
        }


    }


/*
    public static void main(String[] args) {

        Father father = new Father.Builder().withAge(34).withName("fatherName")
                .withJob(Job.BB).withLastName("fatherLastName").build();

        System.out.println("father = " + father);
    }
*/


}
