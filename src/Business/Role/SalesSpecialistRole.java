package Business.Role;

import Business.Business;
import Business.Organization.SalesSpecialistOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SalesSpecialistRole.SalesSpecialistWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SalesSpecialistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        return new SalesSpecialistWorkAreaJPanel(userProcessContainer, account, (SalesSpecialistOrganization)organization, business);
    }
    
}
