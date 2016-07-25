package modelo_entities;

public class AdmiInfo {
private String Object;
private String Version;



public AdmiInfo(){}

public AdmiInfo(String Object,String Version)
{

super();
this.Object=Object;
this.Version=Version;
}

public String getVersion() {
	return Version;
}

public void setVersion(String Version) {
	this.Version = Version;
}


public String getObject() {
	return Object;
}

public void setObject(String Object) {
	this.Object = Object;
    }

  }