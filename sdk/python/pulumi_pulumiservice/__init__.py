# coding=utf-8
# *** WARNING: this file was generated by pulumigen. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from ._enums import *
from .access_token import *
from .provider import *
from .stack_tag import *
from .team import *
from .team_stack_permission import *
from .webhook import *

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_pulumiservice.config as __config
    config = __config
else:
    config = _utilities.lazy_import('pulumi_pulumiservice.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "pulumiservice",
  "mod": "index",
  "fqn": "pulumi_pulumiservice",
  "classes": {
   "pulumiservice:index:AccessToken": "AccessToken",
   "pulumiservice:index:StackTag": "StackTag",
   "pulumiservice:index:Team": "Team",
   "pulumiservice:index:TeamStackPermission": "TeamStackPermission",
   "pulumiservice:index:Webhook": "Webhook"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "pulumiservice",
  "token": "pulumi:providers:pulumiservice",
  "fqn": "pulumi_pulumiservice",
  "class": "Provider"
 }
]
"""
)
