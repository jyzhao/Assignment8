package Business.Role;

import Business.Business;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CustomerRole.CustomerWorkAreaJPanel;
import javax.swing.JPanel;

public class CustomerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        return new CustomerWorkAreaJPanel(userProcessContainer, account, (CustomerOrganization)organization, business);
    }
    
}
