package org.acme;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.event.ComponentSystemEventListener;
import javax.faces.event.ListenerFor;
import javax.faces.event.PreRenderComponentEvent;

import org.primefaces.PrimeFaces;

@ResourceDependencies({
		@ResourceDependency(name = "crypt.js", library = "js", target = "head"),
})
@FacesConverter(value = "EncryptConverter")
//@ListenerFor(systemEventClass = PreRenderComponentEvent.class)
public class EncryptConverter implements Converter, ComponentSystemEventListener {

	public EncryptConverter() {
		super();
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return value;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return value.toString();
	}

	@Override
	public void processEvent(ComponentSystemEvent event) throws AbortProcessingException {
		System.out.println("++ Process Event");

		StringBuilder sb = new StringBuilder(512);
		sb.append("crypt.init(\"123\");");
		PrimeFaces.current().executeScript(sb.toString());
	}
}