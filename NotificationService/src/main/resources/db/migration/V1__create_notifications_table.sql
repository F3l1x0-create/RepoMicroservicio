CREATE TABLE notifications (
    notification_id BIGSERIAL PRIMARY KEY,
    notification_title VARCHAR(255) NOT NULL,
    notification_message TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);  