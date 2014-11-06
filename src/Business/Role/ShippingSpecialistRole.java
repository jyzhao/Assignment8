package Business.Role;

import Business.Business;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.Organization.ShippingSpecialistOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.CustomerRole.CustomerWorkAreaJPanel;
import UserInterface.ShippingSpecialistRole.ShippingSpecialistWorkAreaJPanel;
import javax.swing.JPanel;

public class ShippingSpecialistRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        return new ShippingSpecialistWorkAreaJPanel(userProcessContainer, account, (ShippingSpecialistOrganization)organization, business);
    }
    
}
