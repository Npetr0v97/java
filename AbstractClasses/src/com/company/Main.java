package com.company;

public class Main {

    public static void main(String[] args) {

        //Разлика между интерфейс и абстрактен клас
        //Интерфейса е изцяло абстрактен и в него могат да се декларират единствено методи. Там не могат да се разписват
        //самите методи и не могат да се декларират променливи

        //От друга страна абстрактния клас позволява също да се декларират абстрактни методи, но също позволява описването на методи
        //както и декларирането на променливи, които в последствие се наследяват (референция към наследяване при класовете)
        //интерфейса може да има само константи, които се декларират като public static final (static, защото Non-static
        //променливи изискват инстанция, която не може да направим при интерфейсите

        //абстракния клас, подобно на интерфейса, не може да бъде инициализиран (instantiated), но може да съдържа конструктор
        //или може да има статични методи, които да се достъпват без нужда от инстанция
        //така имаме няколко нива на наследяване и абстракция: наследяване <-> абстрактен клас <-> интерфейс

        //при интерфейсите абстрактните методи може да са публик само, а при abstract-ния клас може да има и
        //private и public методи

        Dog dog = new Dog ("Rex");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }
}
