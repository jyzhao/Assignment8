package Business.Role;

import Business.Business;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Customer("Customer"),
        SalesSpecialist("Sales Specialist"),
        ShippingSpecialist("Shipping Specialist"),
        Supplier("Supplier");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}