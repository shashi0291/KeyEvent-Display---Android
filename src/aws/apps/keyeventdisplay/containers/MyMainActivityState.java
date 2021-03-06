/*******************************************************************************
 * Copyright 2012 Alexandros Schillings
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package aws.apps.keyeventdisplay.containers;

public class MyMainActivityState {
	private CharSequence logText;
	private boolean chkKeyEvents;
	private boolean chkLogcat;
	private boolean chkKenel;

	public CharSequence getLogText() {
		return logText;
	}
	public boolean isChkKenel() {
		return chkKenel;
	}
	public boolean isChkKeyEvents() {
		return chkKeyEvents;
	}
	public boolean isChkLogcat() {
		return chkLogcat;
	}
	public void setChkKenel(boolean chkKenel) {
		this.chkKenel = chkKenel;
	}
	public void setChkKeyEvents(boolean chkKeyEvents) {
		this.chkKeyEvents = chkKeyEvents;
	}
	public void setChkLogcat(boolean chkLogcat) {
		this.chkLogcat = chkLogcat;
	}
	public void setLogText(CharSequence logText) {
		this.logText = logText;
	}


}
