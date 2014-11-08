package Business.Organization;

import Business.Role.Role;
import Business.Role.SupplierRole;
import java.util.ArrayList;

public class SupplierOrganization extends Organization{

    public SupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierRole());
        return roles;
    }
     
   
    
    
}
