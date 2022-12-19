public class TesterList {
    //Создаем список и реализуем методы удаления элемента, очищения списка, создания списка, проверки на пустоту списка
    public static void main(String[] args) {
        GroupList g = new GroupList();
        g.CreateList();
        if (g.isEmpty())
            System.out.println("Список пустой");
        else
            System.out.println("Список не пустой");
        g.AddToList();
        g.AddToList();
        g.AddToList();
        g.ToScreen();
        if (g.isEmpty())
            System.out.println("Список пустой");
        else
            System.out.println("Список не пустой");
        g.RemoveFromList(0);
        g.ToScreen();
        g.DeleteAll();
        if (g.isEmpty())
            System.out.println("Список пустой");
        else
            System.out.println("Список не пустой");
    }
}