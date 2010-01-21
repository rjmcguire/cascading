/*
 * Copyright (c) 2007-20010 Concurrent, Inc. All Rights Reserved.
 *
 * Project and contact information: http://www.cascading.org/
 *
 * This file is part of the Cascading project.
 *
 * Cascading is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Cascading is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Cascading.  If not, see <http://www.gnu.org/licenses/>.
 */

package cascading.flow;

import java.io.IOException;

/**
 * Interface FlowSkipStrategy is used to create new strategies that decide when a {@link Flow} should
 * be skipped when executed in a {@link cascading.cascade.Cascade}. The default strategy is
 * {@link cascading.flow.FlowSkipIfSinkStale}.
 *
 * @see cascading.flow.FlowSkipIfSinkExists
 * @see cascading.flow.FlowSkipIfSinkStale
 */
public interface FlowSkipStrategy
  {
  boolean skipFlow( Flow flow ) throws IOException;
  }