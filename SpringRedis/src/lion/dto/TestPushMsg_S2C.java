package lion.dto;

import java.io.Serializable;

public class TestPushMsg_S2C extends Amf3BaseDTO implements Serializable {

	private static final long serialVersionUID = 6110053063586313065L;

	private NameDTO nameDTO;

	public NameDTO getNameDTO() {
		return nameDTO;
	}

	public void setNameDTO(NameDTO nameDTO) {
		this.nameDTO = nameDTO;
	}
	
}
