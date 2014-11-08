/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class ShipmentWorkRequest extends WorkRequest{
    
    private String shipmentResult;

    public String getShipmentResult() {
        return shipmentResult;
    }

    public void setShipmentResult(String shipmentResult) {
        this.shipmentResult = shipmentResult;
    }
    
    
}
