/*
 * Copyright (c) 2023 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository https://github.com/whichlicense/metadata-seekers.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

import com.whichlicense.metadata.seeker.MetadataSeeker;
import com.whichlicense.metadata.seeker.gitattributes.GitattributesSeeker;

module whichlicense.seeker.gitattributes {
    requires transitive whichlicense.seeker;
    exports com.whichlicense.metadata.seeker.gitattributes;
    provides MetadataSeeker with GitattributesSeeker;
}
