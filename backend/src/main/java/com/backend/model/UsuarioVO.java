package com.backend.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.backend.entities.Rol;
import com.backend.entities.RolUsuario;
import com.backend.entities.Usuario;

public class UsuarioVO {
	
	private Integer id;
	
	private String username;
	
	private String password;
	
	private String correoElectronico;
	
	private String sessionId;
	
	private Integer usuarioCreacionId;

	private LocalDateTime fechaCreacion;

	private Integer usuarioModificacionId;

	private LocalDateTime fechaModificacion;

	private List<RolUsuario> rolesUsuario;

	private List<Rol> roles;
	
	public UsuarioVO(Usuario usuario) {
		// TODO Auto-generated constructor stub
		this.id = usuario.getId();
		this.username = usuario.getUsername();
		this.correoElectronico = usuario.getCorreoElectronico();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Integer getUsuarioCreacionId() {
		return usuarioCreacionId;
	}

	public void setUsuarioCreacionId(Integer usuarioCreacionId) {
		this.usuarioCreacionId = usuarioCreacionId;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getUsuarioModificacionId() {
		return usuarioModificacionId;
	}

	public void setUsuarioModificacionId(Integer usuarioModificacionId) {
		this.usuarioModificacionId = usuarioModificacionId;
	}

	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public List<RolUsuario> getRolesUsuario() {
		return rolesUsuario;
	}

	public void setRolesUsuario(List<RolUsuario> roles) {
		this.rolesUsuario = roles;
	}

	public List<Rol> getRoles() {
		this.roles = new ArrayList<Rol>();
		if (this.rolesUsuario !=null) {
			for (RolUsuario ru: rolesUsuario) {
				roles.add( ru.getRol() );
			}
		}
		return roles;
	}

	
}
