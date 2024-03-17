#!/bin/bash
# Create directory if it doesn't exist
mkdir -p /myapp/logs
# Redirect logs to the specified file
exec > /myapp/logs/application.log 2>&1
# Execute the CMD or provided command
exec "$@"