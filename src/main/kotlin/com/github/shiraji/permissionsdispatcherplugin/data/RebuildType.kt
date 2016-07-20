package com.github.shiraji.permissionsdispatcherplugin.data

enum class RebuildType(val id: Int, val text: String) {
    PROMPT(0, "Prompt"),
    ALWAYS(1, "Always"),
    NOT_ALWAYS(2, "Not Always");
}