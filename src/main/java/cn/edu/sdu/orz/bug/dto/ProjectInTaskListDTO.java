package cn.edu.sdu.orz.bug.dto;

public class ProjectInTaskListDTO {
    private String id;

    private String name;

    private String owner;

    private Long modules;

    private Long owners;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Long getModules() {
        return modules;
    }

    public void setModules(Long modules) {
        this.modules = modules;
    }

    public Long getOwners() {
        return owners;
    }

    public void setOwners(Long owners) {
        this.owners = owners;
    }

    public ProjectInTaskListDTO(String id, String name, String owner, Long modules, Long owners) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.modules = modules;
        this.owners = owners;
    }
}
