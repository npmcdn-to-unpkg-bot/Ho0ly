package com.bay1ts.domain;

public class GroupAuthorities {
    private Long gaId;

    private Long groupId;

    private String authority;

    public Long getGaId() {
        return gaId;
    }

    public void setGaId(Long gaId) {
        this.gaId = gaId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }
}