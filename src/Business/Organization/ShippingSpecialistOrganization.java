package Business.Organization;

import Business.Role.SalesSpecialistRole;
import Business.Role.Role;
import Business.Role.ShippingSpecialistRole;
import java.util.ArrayList;

public class ShippingSpecialistOrganization extends Organization{

    public ShippingSpecialistOrganization() {
        super(Organization.Type.ShippingSpecialist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ShippingSpecialistRole());
        return roles;
    }
     
   
    
    
}
