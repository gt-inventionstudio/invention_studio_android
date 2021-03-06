package inventionstudio.inventionstudioandroid.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import inventionstudio.inventionstudioandroid.Model.Equipment;
import inventionstudio.inventionstudioandroid.R;

/**
 * Created by Rishab K on 1/27/2018.
 */

public class EquipmentAdapter extends ArrayAdapter<Equipment> {

    Context context;
    int layoutResourceId;
    ArrayList<Equipment> data = null;

    /**
     * Adapter for displaying the status of the equipment in the studio
     * @param context Context of the adapter
     * @param layoutResourceId id of the resource that will be filled
     * @param data data for the equipment
     */
    public EquipmentAdapter(Context context, int layoutResourceId, ArrayList<Equipment> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        EquipmentHolder holder = null;

        // Set row with the icon, name, and status of the equipment
        if(row == null) {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new EquipmentHolder();
            holder.icon = (ImageView)row.findViewById(R.id.status_icon);
            holder.name = (TextView)row.findViewById(R.id.equipment_name);
            holder.statusText = (TextView)row.findViewById(R.id.status_text);

            row.setTag(holder);
        }
        else {
            holder = (EquipmentHolder) row.getTag();
        }

        // Set values of each element in the row
        Equipment m = data.get(position);
        if (m != null) {
            holder.name.setText(m.getToolName());
            holder.icon.setImageResource(m.statusIcon());
            holder.statusText.setText(m.statusText());
        }

        return row;
    }

    // Class to hold the different elements of the row
    static class EquipmentHolder {
        ImageView icon;
        TextView name;
        TextView statusText;
    }
}
