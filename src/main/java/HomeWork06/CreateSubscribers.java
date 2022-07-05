package HomeWork06;



public class CreateSubscribers {
    public static Subscriber[] getSubscriberArray() {
        Subscriber[] subArray = new Subscriber[5];
        subArray[0] = new Subscriber(573, "Иванов", "Иван", "Иванович", "Харьков", "0618698421", "А459866", 894.75, 487, 0, 52.04);
        subArray[1] = new Subscriber(628, "Петров", "Василий", "Семенович", "Днепр", "0657899348", "Н241185", -36.78, 136, 345, 132.17);
        subArray[2] = new Subscriber(701, "Сидоров", "Петр", "Валерьевич", "Одесса", "0613488429", "Р185256", 248.17, 387, 185, 36.55);
        subArray[3] = new Subscriber(384, "Караваев", "Сергей", "Степанович", "Львов", "0976198421", "К177893", -25.36, 19, 0, 17.84);
        subArray[4] = new Subscriber(196, "Забарный", "Николай", "Антовнович", "Одесса", "0657824687", "М652883", -4.15, 78, 224, 65.89);
        return subArray;
    }
}