package com.applozic.mobicomkit.uiwidgets.conversation;

import com.applozic.mobicommons.json.JsonMarker;

import java.util.ArrayList;

/**
 * Created by reytum on 1/8/17.
 */

public class MobicomMessageTemplate extends JsonMarker {

    private boolean isEnabled;
    private String backgroundColor;
    private String borderColor;
    private String textColor;
    private int cornerRadius;
    private boolean sendMessageOnClick;
    private boolean hideOnSend = false;
    private ArrayList<String> messageList;
    private MessageContentItem textMessageList;
    private MessageContentItem imageMessageList;
    private MessageContentItem videoMessageList;
    private MessageContentItem contactMessageList;
    private MessageContentItem locationMessageList;
    private MessageContentItem audioMessageList;

    public MessageContentItem getTextMessageList() {
        return textMessageList;
    }

    public void setTextMessageList(MessageContentItem textMessageList) {
        this.textMessageList = textMessageList;
    }

    public MessageContentItem getImageMessageList() {
        return imageMessageList;
    }

    public void setImageMessageList(MessageContentItem imageMessageList) {
        this.imageMessageList = imageMessageList;
    }

    public MessageContentItem getVideoMessageList() {
        return videoMessageList;
    }

    public void setVideoMessageList(MessageContentItem videoMessageList) {
        this.videoMessageList = videoMessageList;
    }

    public MessageContentItem getContactMessageList() {
        return contactMessageList;
    }

    public void setContactMessageList(MessageContentItem contactMessageList) {
        this.contactMessageList = contactMessageList;
    }

    public MessageContentItem getLocationMessageList() {
        return locationMessageList;
    }

    public void setLocationMessageList(MessageContentItem locationMessageList) {
        this.locationMessageList = locationMessageList;
    }

    public MessageContentItem getAudioMessageList() {
        return audioMessageList;
    }

    public void setAudioMessageList(MessageContentItem audioMessageList) {
        this.audioMessageList = audioMessageList;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public String getBackGroundColor() {
        return backgroundColor;
    }

    public void setBackGroundColor(String backGroundColor) {
        this.backgroundColor = backGroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void setHideOnSend(boolean hideOnSend) {
        this.hideOnSend = hideOnSend;
    }

    public boolean getHideOnSend() {
        return hideOnSend;
    }

    public ArrayList<String> getMessages() {
        return messageList;
    }

    public void setMessages(ArrayList<String> messages) {
        this.messageList = messages;
    }

    public int getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public boolean getSendMessageOnClick() {
        return sendMessageOnClick;
    }

    public void setSendMessageOnClick(boolean sendMessageOnClick) {
        this.sendMessageOnClick = sendMessageOnClick;
    }

    public class MessageContentItem {
        private boolean showOnSenderSide;
        private boolean showOnReceiverSide;
        private boolean sendMessageOnClick;
        private ArrayList<String> messageList;

        public boolean isShowOnSenderSide() {
            return showOnSenderSide;
        }

        public void setShowOnSenderSide(boolean showOnSenderSide) {
            this.showOnSenderSide = showOnSenderSide;
        }

        public boolean isShowOnReceiverSide() {
            return showOnReceiverSide;
        }

        public void setShowOnReceiverSide(boolean showOnReceiverSide) {
            this.showOnReceiverSide = showOnReceiverSide;
        }

        public boolean isSendMessageOnClick() {
            return sendMessageOnClick;
        }

        public void setSendMessageOnClick(boolean sendMessageOnClick) {
            this.sendMessageOnClick = sendMessageOnClick;
        }

        public ArrayList<String> getMessageList() {
            return messageList;
        }

        public void setMessageList(ArrayList<String> messageList) {
            this.messageList = messageList;
        }
    }

    @Override
    public String toString() {
        return "MobicomMessageTemplate{" +
                "isEnabled=" + isEnabled +
                ", backgroundColor='" + backgroundColor + '\'' +
                ", borderColor='" + borderColor + '\'' +
                ", textColor='" + textColor + '\'' +
                ", cornerRadius=" + cornerRadius +
                ", hideOnSend=" + hideOnSend +
                ", messageList=" + messageList +
                '}';
    }
}