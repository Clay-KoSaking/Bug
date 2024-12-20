package cn.edu.sdu.orz.bug.vo;


import java.io.Serializable;

public class ModuleUpdateVO extends ModuleVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String projectId;

    private String name;

    public ModuleUpdateVO(String projectId, String name) {
        this.projectId = projectId;
        this.name = name;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
