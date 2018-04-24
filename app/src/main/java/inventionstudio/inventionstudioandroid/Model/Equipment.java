package inventionstudio.inventionstudioandroid.Model;

/**
 * Created by Rishab K on 2/8/2018.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import inventionstudio.inventionstudioandroid.R;

public class Equipment implements Serializable, Comparable<Equipment>{

    transient private int statusComparisonVal;

    private int getStatusComparisonVal() {
        return statusComparisonVal;
    }

    public int compareTo(Equipment other) {
        if (this.statusComparisonVal == other.getStatusComparisonVal()) {
            return this.getToolName().compareTo(other.getToolName());
        }
        return this.statusComparisonVal - other.getStatusComparisonVal();
    }

    @SerializedName("equipmentGroupId")
    @Expose
    private Integer equipmentGroupId;
    @SerializedName("locationId")
    @Expose
    private Integer locationId;
    @SerializedName("toolId")
    @Expose
    private Integer toolId;
    @SerializedName("currentUserUserName")
    @Expose
    private String currentUserUserName;
    @SerializedName("equipmentGroupDescription")
    @Expose
    private String equipmentGroupDescription;
    @SerializedName("equipmentGroupName")
    @Expose
    private String equipmentGroupName;
    @SerializedName("locationAddress")
    @Expose
    private String locationAddress;
    @SerializedName("locationManager")
    @Expose
    private String locationManager;
    @SerializedName("locationName")
    @Expose
    private String locationName;
    @SerializedName("locationDescription")
    @Expose
    private String locationDescription;
    @SerializedName("locationUrl")
    @Expose
    private String locationUrl;
    @SerializedName("toolCurrentUser")
    @Expose
    private String toolCurrentUser;
    @SerializedName("toolDescription")
    @Expose
    private String toolDescription;
    @SerializedName("toolName")
    @Expose
    private String toolName;
    @SerializedName("locationPhone")
    @Expose
    private String locationPhone;
    @SerializedName("toolInUseSince")
    @Expose
    private String toolInUseSince;
    @SerializedName("toolIsOperational")
    @Expose
    private Boolean toolIsOperational;

    public Integer getEquipmentGroupId() {
        return equipmentGroupId;
    }

    public void setEquipmentGroupId(Integer equipmentGroupId) {
        this.equipmentGroupId = equipmentGroupId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getToolId() {
        return toolId;
    }

    public void setToolId(Integer toolId) {
        this.toolId = toolId;
    }

    public String getCurrentUserUserName() {
        return currentUserUserName;
    }

    public void setCurrentUserUserName(String currentUserUserName) {
        this.currentUserUserName = currentUserUserName;
    }

    public String getEquipmentGroupDescription() {
        return equipmentGroupDescription;
    }

    public void setEquipmentGroupDescription(String equipmentGroupDescription) {
        this.equipmentGroupDescription = equipmentGroupDescription;
    }

    public String getEquipmentGroupName() {
        return equipmentGroupName;
    }

    public void setEquipmentGroupName(String equipmentGroupName) {
        this.equipmentGroupName = equipmentGroupName;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getLocationManager() {
        return locationManager;
    }

    public void setLocationManager(String locationManager) {
        this.locationManager = locationManager;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getLocationUrl() {
        return locationUrl;
    }

    public void setLocationUrl(String locationUrl) {
        this.locationUrl = locationUrl;
    }

    public String getToolCurrentUser() {
        return toolCurrentUser;
    }

    public void setToolCurrentUser(String toolCurrentUser) {
        this.toolCurrentUser = toolCurrentUser;
    }

    public String getToolDescription() {
        return toolDescription;
    }

    public void setToolDescription(String toolDescription) {
        this.toolDescription = toolDescription;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getLocationPhone() {
        return locationPhone;
    }

    public void setLocationPhone(String locationPhone) {
        this.locationPhone = locationPhone;
    }

    public String getToolInUseSince() {
        return toolInUseSince;
    }

    public void setToolInUseSince(String toolInUseSince) {
        this.toolInUseSince = toolInUseSince;
    }

    public Boolean getToolIsOperational() {
        return toolIsOperational;
    }

    public void setToolIsOperational(Boolean toolIsOperational) {
        this.toolIsOperational = toolIsOperational;
    }

    public int statusIcon() {
        if (toolIsOperational) {
            if (!toolCurrentUser.equals("")) {
                statusComparisonVal = 0;
                return R.drawable.in_use;
            }
            statusComparisonVal = -1;
            return R.drawable.available;

        }
        statusComparisonVal = 1;
        return R.drawable.unavailable;

    }

    public String statusText() {
        if (toolIsOperational) {
            if (!toolCurrentUser.equals("")) {
                return "In Use";
            }
            return "Available";
        }
        return "Down";
    }
}
