package Business.Organization;

import Business.Role.SalesSpecialistRole;
import Business.Role.Role;
import java.util.ArrayList;

public class SalesSpecialistOrganization extends Organization{

    public SalesSpecialistOrganization() {
        super(Organization.Type.SalesSpecialist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SalesSpecialistRole());
        return roles;
    }
     
   
    
    
}
