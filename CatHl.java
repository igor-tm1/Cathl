package com.company;

    public class CatHl  {
        public static void main(String[] args) {
            Cat grandFather = new Cat("дедушка Маркиз");
            Cat grandMother = new Cat("бабушка Мурка");
            Cat father = new Cat("папа Барсик", grandFather, true);
            Cat mother = new Cat("мама Варвара", grandMother, false);

            grandFather.printCat();
            grandMother.printCat();
            father.printCat();
            mother.printCat();
        }
    }

    class Cat {
        private Cat father;
        private Cat mother;
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        public Cat(String name, Cat cat, boolean isFather) {
            this.name = name;
            if (isFather) father = cat;
            else mother = cat;
        }

        public void printCat() {
            if (mother != null && father != null) {
                System.out.println("Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name);
            } else if (father != null && mother == null) {
                System.out.println("Cat name is " + name + ", no mother, father is " + father.name);
            } else if (mother != null && father == null) {
                System.out.println("Cat name is " + name + ", mother is " + mother.name + ", no father");
            } else {
                System.out.println("Cat name is " + name + ", no mother, no father");
            }
        }
    }

}
