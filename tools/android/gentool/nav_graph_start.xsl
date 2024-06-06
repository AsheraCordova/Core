<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
	xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">
    <xsl:template match="/">
startDestination=<xsl:value-of select="/navigation/@app:startDestination" /><xsl:text>&#xa;</xsl:text>
    	<xsl:for-each select="/navigation/fragment">
<xsl:value-of select="@android:id" />=<xsl:value-of select="@tools:layout" /><xsl:text>&#xa;</xsl:text>
		</xsl:for-each>
    </xsl:template>
</xsl:stylesheet>