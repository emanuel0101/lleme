package uff.ic.letstalk.corbaObjects.scs;

/**
 * corbaObjects/scs/IComponentHolder.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from scs.idl Sexta-feira, 9 de Dezembro de
 * 2005 18h26min27s BRST
 */

public final class IComponentHolder implements
		org.omg.CORBA.portable.Streamable {
	public uff.ic.letstalk.corbaObjects.scs.IComponent value = null;

	public IComponentHolder() {
	}

	public IComponentHolder(uff.ic.letstalk.corbaObjects.scs.IComponent initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = uff.ic.letstalk.corbaObjects.scs.IComponentHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		uff.ic.letstalk.corbaObjects.scs.IComponentHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return uff.ic.letstalk.corbaObjects.scs.IComponentHelper.type();
	}

}
