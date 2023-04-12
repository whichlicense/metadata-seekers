/*
 * Copyright (c) 2023 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository https://github.com/whichlicense/metadata-seekers.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package com.whichlicense.metadata.seeker.notice;

import com.whichlicense.metadata.seeker.MetadataSeeker;
import com.whichlicense.metadata.seeker.MetadataSourceType;

import java.util.Set;

import static com.whichlicense.metadata.seeker.MetadataSourceType.FILE;

/**
 * A concrete implementation of the MetadataSeeker interface that seeks for notice files.
 *
 * @author David Greven
 * @version 0
 * @since 0.0.0
 */
public record NoticeSeeker() implements MetadataSeeker {
    /**
     * Returns a set of notice file focused glob patterns.
     *
     * @return A set of glob patterns as strings.
     * @since 0.0.0
     */
    @Override
    public Set<String> globs() {
        return Set.of("**/NOTICE*", "**/notice*");
    }

    /**
     * Returns the metadata source type {@link MetadataSourceType#FILE}.
     *
     * @return The type of metadata source as a MetadataSourceType enum value.
     * @since 0.0.0
     */
    @Override
    public MetadataSourceType type() {
        return FILE;
    }
}
