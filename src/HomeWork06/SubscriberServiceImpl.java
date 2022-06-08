package HomeWork06;


import static HomeWork06.CreateSubscribers.getSubscriberArray;

public class SubscriberServiceImpl implements SubscriberService {

    public static void main(String[] args) {
        subscribersMin(getSubscriberArray(), 200);
        subscribersIntercityMin(getSubscriberArray(), 0);
        subscriberInformation(getSubscriberArray(), 'К');
        cityTraffic(getSubscriberArray(), "Одесса");
        negativeBalance(getSubscriberArray(), 0);
    }




    public static void subscribersMin(Subscriber[] subArray, int min) {
        System.out.println("Абоненты, у которых время внутригородских разговоров превышает " + min + " минут :");
        for (Subscriber subscriber : subArray) {
            if (subscriber.getMin() > min) {
                System.out.println(subscriber.toString());
            }
        }
        System.out.println();
    }


    public static void subscribersIntercityMin(Subscriber[] subArray, int intercityMin) {
        System.out.println("Абоненты, которые пользовались междугородней связью: ");
        for (Subscriber subscriber : subArray) {
            if (subscriber.getIntercityMin() > intercityMin) {
                System.out.println(subscriber.toString());
            }
        }
        System.out.println();
    }



    public static void subscriberInformation(Subscriber[] subArray, char c) {
        System.out.println("Сведения об абонентах, у которых фамилия начинается с " + c + ":");
        for (Subscriber subscriber : subArray) {
            if (c==(subscriber.getSurname().charAt(0))) {
                System.out.println(subscriber.getSurname().toString());
                System.out.println(subscriber.getName().toString());
                System.out.println(subscriber.getMiddleName().toString());
                System.out.println(subscriber.getPhoneNumber().toString());
                System.out.println(subscriber.getBalance());
                System.out.println();
            }
        }
        System.out.println();
    }



    public static void cityTraffic(Subscriber[] subArray, String city) {
        System.out.println("Суммарное потребление трафика интернета для города " + city + ":");
        double count = 0;
        for (Subscriber subscriber : subArray) {
            if (subscriber.getCity().equals(city)) {
                count = count + subscriber.getInternetTrafficGb();
            }
        }
        System.out.println(count);
        System.out.println();
    }



    public static void negativeBalance(Subscriber[] subArray, int balance) {
        System.out.println("Количество абонентов с отрицательным балансом: ");
        int count = 0;
        for (Subscriber subscriber : subArray) {
            if (subscriber.getBalance() < balance) {
               count++;
            }
        }
        System.out.println(count);
        System.out.println();
    }
}
