package ru.mirea.pr1;
public class Main {
    public static void main(String[] args) {
        Book b1=new Book("Master and Margaret","Bulgakow", 310,"Comedy, novel");
        Book b2=new Book("Dubrovkiy","Pushkin", 50,"Novel");
        Book b3= new Book("Crime and punishment", "Dostoyevskiy",672,"Criminal novel");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }

}
