package HomeWork05;
public class CreateStudents {
    public static Student[] getStudentArray() {
        Student[] stArray = new Student[10];
        stArray[0] = new Student (573, "Иванов", "Иван", "Иванович", 1999,"Хрещатик 25", "0618698421","Химия",2, "Х20");
        stArray[1] = new Student (628, "Петров", "Василий", "Семенович", 1993,"Дерибасовская 68", "0657899348","Физика",5, "Ф17");
        stArray[2] = new Student (701, "Сидоров", "Петр", "Валерьевич", 1997,"Хрещатик 25", "0613488429","Математика",2, "М20");
        stArray[3] = new Student (384, "Караваев", "Сергей", "Степанович", 1998,"Свободы 33", "0976198421","Химия",2, "Х20");
        stArray[4] = new Student (196, "Забарный", "Николай", "Антовнович", 1995,"Хрещатик 17", "0657824687","Математика",4, "М18");
        stArray[5] = new Student (854, "Бондарь", "Александр", "Генадевичь", 1998,"Победы 117", "0657102426","Физика",1, "Ф21");
        stArray[6] = new Student (203, "Мотвиенко", "Василий", "Петрович", 1996,"Космонавтов 5", "0630598421","История",2, "И20");
        stArray[7] = new Student (415, "Сидорчук", "Семен", "Иванович", 1997,"Хрещатик 25", "0657898186","Физика",3, "Ф19");
        stArray[8] = new Student (169, "Гармаш", "Степан", "Григорьевич", 1999,"Хрещатик 19", "0657079400","Химия",1, "Х21");
        stArray[9] = new Student (331, "Степаненко", "Василий", "Васильевич", 1994,"Садовая 21", "0016898427","Химия",5, "Х17");
        return stArray;
    }
}