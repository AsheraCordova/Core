<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

    <xsl:template match="/">
    	export const LOCALE_MANAGER_KEYS: string[] = [
    	<xsl:for-each select="resources/string[@ts = 'true']">
    		<xsl:text>"</xsl:text><xsl:value-of select="@name" /><xsl:text>",</xsl:text>
    	</xsl:for-each>
        <xsl:for-each select="resources/array">
        	<xsl:text>"</xsl:text><xsl:value-of select="@name" /><xsl:text>",</xsl:text>
        </xsl:for-each>	    
    ];
	</xsl:template>

</xsl:stylesheet>