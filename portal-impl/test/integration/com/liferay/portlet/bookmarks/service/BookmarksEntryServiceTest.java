/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.bookmarks.service;

import com.liferay.portal.kernel.test.ExecutionTestListeners;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.test.EnvironmentExecutionTestListener;
import com.liferay.portal.test.LiferayIntegrationJUnitTestRunner;
import com.liferay.portal.test.TransactionalCallbackAwareExecutionTestListener;
import com.liferay.portlet.bookmarks.model.BookmarksEntry;
import com.liferay.portlet.bookmarks.util.BookmarksTestUtil;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Brian Wing Shun Chan
 */
@ExecutionTestListeners(
	listeners = {
		EnvironmentExecutionTestListener.class,
		TransactionalCallbackAwareExecutionTestListener.class
	})
@RunWith(LiferayIntegrationJUnitTestRunner.class)
@Transactional
public class BookmarksEntryServiceTest {

	@Test
	public void testAddEntry() throws Exception {
		BookmarksTestUtil.addEntry();
	}

	@Test
	public void testDeleteEntry() throws Exception {
		BookmarksEntry entry = BookmarksTestUtil.addEntry();

		BookmarksEntryServiceUtil.deleteEntry(entry.getEntryId());
	}

	@Test
	public void testGetEntry() throws Exception {
		BookmarksEntry entry = BookmarksTestUtil.addEntry();

		BookmarksEntryServiceUtil.getEntry(entry.getEntryId());
	}

}