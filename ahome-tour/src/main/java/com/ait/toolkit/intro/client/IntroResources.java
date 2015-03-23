/*
 Copyright (c) 2015 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.intro.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface IntroResources extends ClientBundle {

	public static final IntroResources INSTANCE = GWT.create(IntroResources.class);

	@Source("dark.css")
	TextResource darkTheme();

	@Source("nassim.css")
	TextResource nassimTheme();

	@Source("nazanin.css")
	TextResource nazaninTheme();

	@Source("royal.css")
	TextResource royalTheme();

	@Source("lib.css")
	TextResource css();

	@Source("lib.js")
	TextResource lib();

	@Source("libRtl.js")
	TextResource libRtl();
}
