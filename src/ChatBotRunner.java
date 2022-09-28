public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot debbie = new ChatBot("debbie",10);
        //call three void methods
        debbie.greeting("Kent");
        debbie.weather();
        debbie.favoriteNumber(20);
        debbie.friends();
        //call the non-void methods
        double feetToMeters = debbie.convertFeetToMeters(30);
        System.out.println(feetToMeters);
        int total = debbie.addNumbers(1,2,3);
        System.out.println(total);
        int num = debbie.evenOddNumber(2);
        if (num == 1){
            System.out.println("Your number is odd");
        } else {
            System.out.println("You number is even");
        }
        String bye = debbie.goodbye();
        System.out.println(bye);


    }
}
