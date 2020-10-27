package ru.netology.domain;

public class Comment {

    private int countComments;
    private boolean canCommentPost;  //    может ли текущий пользователь комментировать запись
    private boolean groupsCanCommentPost; //    могут ли сообщества комментировать запись
    private boolean canCloseComments;   //    может ли текущий пользователь закрыть комментарии к записи
    private boolean canOpenComments;//    может ли текущий пользователь открыть комментарии к записи



    public int getCountComments() {
        return countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }

    public boolean isCanCommentPost() {
        return canCommentPost;
    }

    public void setCanCommentPost(boolean canCommentPost) {
        this.canCommentPost = canCommentPost;
    }

    public boolean isGroupsCanCommentPost() {
        return groupsCanCommentPost;
    }

    public void setGroupsCanCommentPost(boolean groupsCanCommentPost) {
        this.groupsCanCommentPost = groupsCanCommentPost;
    }

    public boolean isCanCloseComments() {
        return canCloseComments;
    }

    public void setCanCloseComments(boolean canCloseComments) {
        this.canCloseComments = canCloseComments;
    }

    public boolean isCanOpenComments() {
        return canOpenComments;
    }

    public void setCanOpenComments(boolean canOpenComments) {
        this.canOpenComments = canOpenComments;
    }
}