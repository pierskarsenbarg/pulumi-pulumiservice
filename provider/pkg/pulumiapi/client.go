// Copyright 2016-2022, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package pulumiapi

import (
	"net/http"
	"net/url"
	"time"
)

type Client struct {
	c       *http.Client
	token   string
	baseurl url.URL
}

func NewClient(args ...string) *Client {
	c := &http.Client{Timeout: time.Minute}

	var token string

	var baseURL = url.URL{
		Scheme: "https",
		Host:   "api.pulumi.com",
		Path:   "/api/",
	}

	if len(args) == 0 {
		token = ""
	} else {
		token = args[0]
	}

	if len(args) == 2 {
		token = args[0]
		baseURL.Host = args[1]
	}

	return &Client{
		c:       c,
		token:   token,
		baseurl: baseURL,
	}
}
