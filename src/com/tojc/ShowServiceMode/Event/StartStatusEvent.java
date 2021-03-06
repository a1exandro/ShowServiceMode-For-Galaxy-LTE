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
package com.tojc.ShowServiceMode.Event;

import java.util.EventListener;
import java.util.EventObject;

public class StartStatusEvent
{
	public interface OnFirstStartListener extends EventListener
	{
		public void onFirstStart(StartStatusEventObject e);
	}

	public interface OnUpdateStartListener extends EventListener
	{
		public void onUpdateStart(StartStatusEventObject e);
	}

	public interface OnDowngradeStartListener extends EventListener
	{
		public void onDowngradeStart(StartStatusEventObject e);
	}

	public interface OnNormalStartListener extends EventListener
	{
		public void onNormalStart(StartStatusEventObject e);
	}


	public interface OnLanguageIsChangedListener extends EventListener
	{
		public void onLanguageIsChanged(StartStatusEventObject e);
	}


	public static class StartStatusEventObject extends EventObject
	{
		private static final long serialVersionUID = 4217183946833141473L;

		public StartStatusEventObject(Object source)
		{
			super(source);
		}
	}

}
