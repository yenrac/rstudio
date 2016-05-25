/*
 * NotebookQueueUnit.java
 *
 * Copyright (C) 2009-16 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.rmarkdown.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class NotebookQueueUnit extends JavaScriptObject
{
   protected NotebookQueueUnit()
   {
   }
   
   public final native String getDocId() /*-{
      return this.doc_id;
   }-*/;

   public final native String getChunkId() /*-{
      return this.chunk_id;
   }-*/;

   public final native String getCode() /*-{
      return this.code;
   }-*/;
   
   public final native JsArray<NotebookQueueUnit> getUnits() /*-{
      return this.units;
   }-*/;
}