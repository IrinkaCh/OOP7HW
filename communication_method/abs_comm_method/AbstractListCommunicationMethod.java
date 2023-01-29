package communication_method.abs_comm_method;

import communication_method.interface_comm_method.InterfaceAdress;
import communication_method.interface_comm_method.InterfaceEmail;
import communication_method.interface_comm_method.InterfacePhoneNumber;
import communication_method.interface_comm_method.InterfaceTelegram;
import communication_method.interface_comm_method.InterfaceVk;

public class AbstractListCommunicationMethod implements InterfaceVk, InterfaceTelegram, InterfaceEmail,
        InterfacePhoneNumber, InterfaceAdress {

    @Override
    public void vkMethod() {
    }

    @Override
    public void telegramMethod() {
    }

    @Override
    public void emailMethod() {
    }

    @Override
    public void phoneNumberMethod() {
    }

    @Override
    public void adressMethod() {
    }
}
