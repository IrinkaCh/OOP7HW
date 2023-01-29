import list_contragent.ListContrAgent;
import communication_method.ListCommunicationMethod;
import contragent.ContrAgent;
import control_list_contragent.ControlListContrAgent;

public class Main {
    public static void main(String[] args) {
        // создание способов связаться с контрагентами
        ListCommunicationMethod irinaListCommunicationMethod = new ListCommunicationMethod();
        ListCommunicationMethod egorListCommunicationMethod = new ListCommunicationMethod();
        ListCommunicationMethod olgaListCommunicationMethod = new ListCommunicationMethod();
        ListCommunicationMethod yandexListCommunicationMethod = new ListCommunicationMethod();
        // Создание контрагентов
        ContrAgent irina = new ContrAgent("Irina", 28, irinaListCommunicationMethod);
        ContrAgent egor = new ContrAgent("Egor", 25, egorListCommunicationMethod);
        ContrAgent olga = new ContrAgent("Olga", olgaListCommunicationMethod);
        ContrAgent yandex = new ContrAgent("Yandex", yandexListCommunicationMethod);
        // распечатать по одному контрагенту
        // System.out.println(Irina);
        // System.out.println(Egor);
        // System.out.println(Olga);
        // System.out.println(yandex);
        // создание списка контрагентов
        ListContrAgent listContragent = new ListContrAgent();
        // добавление контрагентов в список контрагентов
        listContragent.addContrAgentInList(irina);
        listContragent.addContrAgentInList(egor);
        listContragent.addContrAgentInList(olga);
        listContragent.addContrAgentInList(yandex);
        // распечатать список контрагентов
        // listContragent.printListContrAgent();
        // Добавление способов связи
        irinaListCommunicationMethod.addVkMethod("vk/114657");
        irinaListCommunicationMethod.addVkMethod("vk/245567");
        irinaListCommunicationMethod.addAdressMethod("ул.Ленина дом 2");
        irinaListCommunicationMethod.addEmailMethod("2345@mail.ru");
        irinaListCommunicationMethod.addTelegramMethod("@jfbr");
        irinaListCommunicationMethod.addPhoneNumberMethod("89556324966");

        egorListCommunicationMethod.addPhoneNumberMethod("89536432823");
        egorListCommunicationMethod.addVkMethod("vk/832547");
        egorListCommunicationMethod.addAdressMethod("ул.Бажова дом 15");

        olgaListCommunicationMethod.addPhoneNumberMethod("2622356");
        olgaListCommunicationMethod.addPhoneNumberMethod("2713159");
        olgaListCommunicationMethod.addPhoneNumberMethod("2799922");
        olgaListCommunicationMethod.addTelegramMethod("@Olga");
        olgaListCommunicationMethod.addEmailMethod("637@mail.ru");

        yandexListCommunicationMethod.addVkMethod("vk/yandex");
        yandexListCommunicationMethod.addAdressMethod("ул.Свердлова дом 167");
        yandexListCommunicationMethod.addPhoneNumberMethod("2767411");
        yandexListCommunicationMethod.addPhoneNumberMethod("2700500");
        yandexListCommunicationMethod.addTelegramMethod("@yandex");
        yandexListCommunicationMethod.addEmailMethod("yandex@yandex.ru");
        // контроллер списка контрагентв
        ControlListContrAgent controlListContrAgent = new ControlListContrAgent(listContragent);
        // распечатать список контрагентов
        controlListContrAgent.printListContrAgent();
        // поиск конрагентов по имени
        controlListContrAgent.serchContrAgent("Olga");
        controlListContrAgent.serchContrAgent("Egor");
        // добавить способ связи с контрагентом
        controlListContrAgent.addNewComminicationMethodPhoneNumber(olga, "23234");
        // удалить способ связи с контрагентом
        controlListContrAgent.delComminicationMethodPhoneNumber(olga, 0);
        // добавить в список нового контрагента
        // controlListContrAgent.addNewContrAgent(listContragent, newName);
    }
}