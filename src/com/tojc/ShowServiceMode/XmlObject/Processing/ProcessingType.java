/*
Copyright (c) 2012, Jaken
All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
 are permitted provided that the following conditions are met:
Redistributions of source code must retain the above copyright notice, this list
 of conditions and the following disclaimer.
Redistributions in binary form must reproduce the above copyright notice, this
 list of conditions and the following disclaimer in the documentation and/or
 other materials provided with the distribution.
Neither the name of the Jaken's laboratory nor the names of its contributors may
 be used to endorse or promote products derived from this software without
 specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package com.tojc.ShowServiceMode.XmlObject.Processing;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.tojc.ShowServiceMode.Processing.ProcessingBase;
import com.tojc.ShowServiceMode.Processing.TypeToInstance;
import com.tojc.ShowServiceMode.XmlObject.IXmlCollectionItem;
import com.tojc.ShowServiceMode.XmlObject.CallingMethod.CallingMethodType;

@Root(name="type")
public class ProcessingType implements IXmlCollectionItem
{
	private static final long serialVersionUID = 6167726303422966366L;

	@Attribute(name="id")
    private int typeId;

	@Attribute(name="name")
    private String typeName;

	@Element(name="title")
    private String typeTitle;

	@Element(name="description")
    private String typeDescription;

	@Element(name="classname")
    private String typeClassName;

	@Element(name="defaultdescription", required=false)
    private String typeDefaultDescription;

	@Element(name="themecolor", required=false)
    private int typeThemeColor;

	public ProcessingType()
	{
	}

	public ProcessingType(int typeid, String typename, String typetitle, String typedescription, String typeclassname, String typedefaultdescription, int typethemecolor)
	{
		this.setTypeId(typeid);
		this.setTypeName(typename);
		this.setTypeTitle(typetitle);
		this.setTypeDescription(typedescription);
		this.setTypeClassName(typeclassname);
		this.setTypeDefaultDescription(typedefaultdescription);
		this.setTypeThemeColor(typethemecolor);
	}

	public int getTypeId()
	{
		return this.typeId;
	}
	public void setTypeId(int typeid)
	{
		this.typeId = typeid;
	}

	public String getTypeName()
	{
		return this.typeName;
	}
	public void setTypeName(String typename)
	{
		this.typeName = typename;
	}

	public String getTypeTitle()
	{
		return this.typeTitle;
	}
	public void setTypeTitle(String typetitle)
	{
		this.typeTitle = typetitle;
	}

	public String getTypeDescription()
	{
		return this.typeDescription;
	}
	public void setTypeDescription(String typedescription)
	{
		this.typeDescription = typedescription;
	}

	public String getTypeClassName()
	{
		return this.typeClassName;
	}
	public void setTypeClassName(String typeclassname)
	{
		this.typeClassName = typeclassname;
	}

	public String getTypeDefaultDescription()
	{
		return this.typeDefaultDescription;
	}
	public void setTypeDefaultDescription(String typedefaultdescription)
	{
		this.typeDefaultDescription = typedefaultdescription;
	}

	public int getTypeThemeColor()
	{
		return this.typeThemeColor;
	}
	public void setTypeThemeColor(int typethemecolor)
	{
		this.typeThemeColor = typethemecolor;
	}


	public ProcessingBase createProcessingInstance(CallingMethodType callingmethodtype)
	{
		return TypeToInstance.createProcessingInstance(this, callingmethodtype);
	}




	
	@Override
	public String toString()
	{
		return this.typeName + "[" + this.typeTitle + "]";
	}

    @Override
    public boolean equals(Object inObject)
    {
    	boolean result = false;
        if (inObject instanceof ProcessingType)
        {
        	ProcessingType ptinfo = (ProcessingType)inObject;
        	result = this.getTypeId() == ptinfo.getTypeId();
        }
        return result;
    }

	@Override
	public int getKeyId()
	{
		return this.getTypeId();
	}

	@Override
	public String getKeyName()
	{
		return this.getTypeName();
	}
}
