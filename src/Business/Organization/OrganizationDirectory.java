package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SalesSpecialist.getValue())){
            organization = new SalesSpecialistOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ShippingSpecialist.getValue())){
            organization = new ShippingSpecialistOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Supplier.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
    
}