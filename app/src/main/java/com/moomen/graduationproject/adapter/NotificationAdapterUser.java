package com.moomen.graduationproject.adapter;


import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.moomen.graduationproject.R;
import com.moomen.graduationproject.model.Notification;
import com.squareup.picasso.Picasso;

public class NotificationAdapterUser extends FirestoreRecyclerAdapter<Notification, NotificationAdapterUser.ViewHolder> {


    private NotificationAdapterUser.OnItemClickListener listener;
    private FirebaseFirestore firebaseFirestore;
    String notificationUid;

    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public NotificationAdapterUser(@NonNull FirestoreRecyclerOptions<Notification> options) {
        super(options);
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull Notification model) {
        Picasso.get().load(model.getUserImage()).into(holder.userImage);
        if (model.getNotificationType().equals("service"))
            holder.notificationTypeImage.setImageResource(R.drawable.ic_baseline_store_24);
        holder.title.setText(model.getTitle());
        holder.description.setText(model.getDescription());
        holder.date.setText(model.getDate());

        if (model.isUser_seen()){
            holder.statusImage.setVisibility(View.GONE);
        }else {
            holder.statusImage.setVisibility(View.VISIBLE);
        }
        firebaseFirestore = FirebaseFirestore.getInstance();
        DocumentSnapshot documentSnapshot = getSnapshots().getSnapshot(position);
        notificationUid = documentSnapshot.getId();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.notification_item, parent, false);
        return new ViewHolder(view);
    }
    public void onItemSetOnClickListener(OnItemClickListener listener) {
        this.listener = listener;

    }

    public interface OnItemClickListener {
        void onItemClick(DocumentSnapshot documentSnapshot, int position);


    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView userImage;
        ImageView statusImage;
        ImageView notificationTypeImage;
        TextView title;
        TextView description;
        TextView date;
        ConstraintLayout constraintLayoutNotificationItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userImage = itemView.findViewById(R.id.imageView_user);
            statusImage = itemView.findViewById(R.id.imageView_status);
            notificationTypeImage = itemView.findViewById(R.id.imageView_notification_type);
            title = itemView.findViewById(R.id.textView_notification_title);
            description = itemView.findViewById(R.id.textView_notification_description);
            date = itemView.findViewById(R.id.textView_notification_date);
            constraintLayoutNotificationItem = itemView.findViewById(R.id.constraintLayout_notification_layout);
            constraintLayoutNotificationItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (getAdapterPosition() != RecyclerView.NO_POSITION && listener != null) {
                        DocumentSnapshot documentSnapshot = getSnapshots().getSnapshot(getAdapterPosition());
                        listener.onItemClick(documentSnapshot, getAdapterPosition());


                    }
                }
            });

        }

    }

}
