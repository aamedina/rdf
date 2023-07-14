(ns net.wikipunk.rdf.exif
  {:dcat/downloadURL  "resources/exif.rdf",
   :rdf/ns-prefix-map {"dc11"    "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "ex"      "http://example.org/",
                       "exif"    "http://www.w3.org/2003/12/exif/ns#",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "exif",
   :rdfa/uri          "http://www.w3.org/2003/12/exif/ns#"})

(def IFD
  "An Image File Directory"
  {:db/ident        :exif/IFD,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString "An Image File Directory@en",
   :rdfs/label      #xsd/langString "IFD@en",
   :rdfs/subClassOf :rdfs/Resource})

(def _unknown
  "An Exif tag whose meaning is not known"
  {:db/ident     :exif/_unknown,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString "An Exif tag whose meaning is not known@en",
   :rdfs/label   #xsd/langString "Unknown tag@en"})

(def apertureValue
  "ApertureValue"
  {:db/ident :exif/apertureValue,
   :exif/tagNumber #xsd/langString "37378@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "レンズ絞り値（APEX値）。この値のルート2のベキ乗を取ると、通常の絞り値となる。例えば'5'の場合だと√2^5=F5.6@ja"
    #xsd/langString "The lens aperture. The unit is the APEX value.@en"],
   :rdfs/label #xsd/langString "ApertureValue@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def artist
  "Person who created the image"
  {:db/ident           :exif/artist,
   :exif/tagNumber     #xsd/langString "315@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "Person who created the image@en",
   :rdfs/label         #xsd/langString "Artist@en",
   :rdfs/subPropertyOf [:dc11/creator :exif/exifAttribute]})

(def bitsPerSample
  "The number of bits per image component. In this standard each component of the image is 8 bits, so the value for this tag is 8. See also SamplesPerPixel. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/bitsPerSample,
   :exif/tagNumber #xsd/langString "258@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The number of bits per image component. In this standard each component of the image is 8 bits, so the value for this tag is 8. See also SamplesPerPixel. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #xsd/langString "BitsPerSample@en",
   :rdfs/subPropertyOf
   [:exif/resolution :exif/imageDataStruct :exif/exifAttribute]})

(def brightnessValue
  "BrightnessValue"
  {:db/ident :exif/brightnessValue,
   :exif/tagNumber #xsd/langString "37379@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "画像撮影時の撮影対象物の明るさ（APEX値）。EVにするにはISO感度の値を足す必要があり、Ev:Exposure, Bv:BrightnessValue, Sv:SensitivityValueとしてEv=Bv+Sv Sv=log^2(ISOSpeedRating/3.125)という計算式を使う。ISO感度100の場合Sv=5、ISO200の場合Sv=6、ISO125ではSv=5.32@ja"
    #xsd/langString
     "The value of brightness. The unit is the APEX value. Ordinarily it is given in the range of -99.99 to 99.99. Note that if the numerator of the recorded value is FFFFFFFF.H, Unknown shall be indicated.@en"],
   :rdfs/label #xsd/langString "BrightnessValue@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def cfaPattern
  "CFAPattern"
  {:db/ident :exif/cfaPattern,
   :exif/tagNumber #xsd/langString "41730@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "CCDに付いているColor filter array(CFA)のパターン。例えば普通のRGBフィルターだと、CFAPatternのデータは 02 02 00 01 01 02@ja"
    #xsd/langString
     "The color filter array (CFA) geometric pattern of the image sensor when a one-chip color area sensor is used. It does not apply to all sensing methods.@en"],
   :rdfs/label #xsd/langString "CFAPattern@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def colorSpace
  "ColorSpace"
  {:db/ident :exif/colorSpace,
   :exif/tagNumber #xsd/langString "40961@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "使われる色空間。通常sRGB@ja"
    #xsd/langString
     "The color space information tag (ColorSpace) is always recorded as the color space specifier. Normally sRGB (=1) is used to define the color space based on the PC monitor conditions and environment.@en"],
   :rdfs/label #xsd/langString "ColorSpace@en",
   :rdfs/subPropertyOf [:exif/imageDataCharacter :exif/exifAttribute]})

(def componentsConfiguration
  "ComponentsConfiguration"
  {:db/ident :exif/componentsConfiguration,
   :exif/tagNumber #xsd/langString "37121@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "圧縮データがYCC以外の並びの場合、4バイトでその並びを示す。それぞれの値は0:not exist,1:Y,2:Cb,3:Cr,4:R,5:G,6:B@ja"
    #xsd/langString
     "Information specific to compressed data. The channels of each component are arranged in order from the 1st component to the 4th. For uncompressed data the data arrangement is given in the PhotometricInterpretation tag. However, since PhotometricInterpretation can only express the order of Y,Cb and Cr, this tag is provided for cases when compressed data uses components other than Y, Cb, and Cr and to enable support of other sequences.@en"],
   :rdfs/label #xsd/langString "ComponentsConfiguration@en",
   :rdfs/subPropertyOf [:exif/imageConfig :exif/exifAttribute]})

(def compressedBitsPerPixel
  "CompressedBitsPerPixel"
  {:db/ident :exif/compressedBitsPerPixel,
   :exif/tagNumber #xsd/langString "37122@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "画像の圧縮率@ja"
    #xsd/langString
     "Information specific to compressed data. The compression mode used for a compressed image is indicated in unit bits per pixel.@en"],
   :rdfs/label #xsd/langString "CompressedBitsPerPixel@en",
   :rdfs/subPropertyOf [:exif/imageConfig :exif/exifAttribute]})

(def compression
  "The compression scheme used for the image data. When a primary image is JPEG compressed, this designation is not necessary and is omitted. When thumbnails use JPEG compression, this tag value is set to 6."
  {:db/ident :exif/compression,
   :exif/tagNumber #xsd/langString "259@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The compression scheme used for the image data. When a primary image is JPEG compressed, this designation is not necessary and is omitted. When thumbnails use JPEG compression, this tag value is set to 6.@en",
   :rdfs/label #xsd/langString "Compression@en",
   :rdfs/subPropertyOf [:exif/imageDataStruct :exif/exifAttribute]})

(def contrast
  "The direction of contrast processing applied by the camera when the image was shot."
  {:db/ident :exif/contrast,
   :exif/tagNumber #xsd/langString "41992@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The direction of contrast processing applied by the camera when the image was shot.@en",
   :rdfs/label #xsd/langString "Contrast@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def copyright
  "Copyright"
  {:db/ident :exif/copyright,
   :exif/tagNumber #xsd/langString "33432@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "この画像の撮影者および編集者の著作権情報@ja"
    #xsd/langString
     "Copyright information. In this standard the tag is used to indicate both the photographer and editor copyrights. It is the copyright notice of the person or organization claiming rights to the image.@en"],
   :rdfs/label #xsd/langString "Copyright@en",
   :rdfs/subPropertyOf [:dc11/rights :exif/exifAttribute]})

(def customRendered
  "CustomRendered"
  {:db/ident :exif/customRendered,
   :exif/tagNumber #xsd/langString "41985@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "特別なレンダリング処理を行っているかどうか@ja"
    #xsd/langString
     "The use of special processing on image data, such as rendering geared to output. When special processing is performed, the reader is expected to disable or minimize any further processing.@en"],
   :rdfs/label #xsd/langString "CustomRendered@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def datatype
  "The Exif field data type, such as ascii, byte, short etc."
  {:db/ident :exif/datatype,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The Exif field data type, such as ascii, byte, short etc.@en",
   :rdfs/label #xsd/langString "Data Type@en",
   :rdfs/subPropertyOf :dc11/type})

(def date
  "a date information. Usually saved as YYYY:MM:DD (HH:MM:SS) format in Exif data, but represented here as W3C-DTF format"
  {:db/ident :exif/date,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "a date information. Usually saved as YYYY:MM:DD (HH:MM:SS) format in Exif data, but represented here as W3C-DTF format@en",
   :rdfs/label #xsd/langString "Date@en",
   :rdfs/subPropertyOf :dc11/date})

(def dateAndOrTime
  "An attribute relating to Date and/or Time"
  {:db/ident           :exif/dateAndOrTime,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "An attribute relating to Date and/or Time@en",
   :rdfs/label         #xsd/langString "Date and/or Time@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def dateTime
  "DateTime"
  {:db/ident :exif/dateTime,
   :exif/tagNumber #xsd/langString "306@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "この画像が作成（あるいは最後に変更された）日時。通常はDateTimeOriginaと同じ値@ja"
    #xsd/langString
     "The date and time of image creation. In this standard it is the date and time the file was changed.@en"],
   :rdfs/label #xsd/langString "DateTime@en",
   :rdfs/subPropertyOf [:exif/date :exif/exifAttribute :dc11/date]})

(def dateTimeDigitized
  "DateTimeDigitized"
  {:db/ident :exif/dateTimeDigitized,
   :exif/tagNumber #xsd/langString "36868@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "画像がデジタル化された日時。デジカメ画像なら通常DateTimeOriginalと同じ値@ja"
    #xsd/langString
     "The date and time when the image was stored as digital data. If, for example, an image was captured by DSC and at the same time the file was recorded, then the DateTimeOriginal and DateTimeDigitized will have the same contents.@en"],
   :rdfs/label #xsd/langString "DateTimeDigitized@en",
   :rdfs/subPropertyOf
   [:exif/date :exif/dateAndOrTime :dc11/date :exif/exifAttribute]})

(def dateTimeOriginal
  "DateTimeOriginal"
  {:db/ident :exif/dateTimeOriginal,
   :exif/tagNumber #xsd/langString "36867@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "オリジナル画像が作成（撮影）された日時@ja"
    #xsd/langString
     "The date and time when the original image data was generated. For a DSC the date and time the picture was taken are recorded.@en"],
   :rdfs/label #xsd/langString "DateTimeOriginal@en",
   :rdfs/subPropertyOf
   [:exif/date :exif/dateAndOrTime :dc11/date :exif/exifAttribute]})

(def deviceSettingDescription
  "Information on the picture-taking conditions of a particular camera model. The tag is used only to indicate the picture-taking conditions in the reader."
  {:db/ident :exif/deviceSettingDescription,
   :exif/tagNumber #xsd/langString "41995@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Information on the picture-taking conditions of a particular camera model. The tag is used only to indicate the picture-taking conditions in the reader.@en",
   :rdfs/label #xsd/langString "DeviceSettingDescription@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def digitalZoomRatio
  "DigitalZoomRatio"
  {:db/ident :exif/digitalZoomRatio,
   :exif/tagNumber #xsd/langString "41988@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "デジタルズームが使われた場合、その比率@ja"
    #xsd/langString
     "The digital zoom ratio when the image was shot. If the numerator of the recorded value is 0, this indicates that digital zoom was not used.@en"],
   :rdfs/label #xsd/langString "DigitalZoomRatio@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def exifAttribute
  "A property that connects an IFD to one of its entries. Super property which integrates all Exif tags."
  {:db/ident :exif/exifAttribute,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A property that connects an IFD to one of its entries. Super property which integrates all Exif tags.@en",
   :rdfs/domain :exif/IFD,
   :rdfs/label #xsd/langString "Exif Attribute@en"})

(def exifVersion
  "ExifVersion"
  {:db/ident           :exif/exifVersion,
   :exif/tagNumber     #xsd/langString "36864@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#xsd/langString "Exif形式のバージョン@ja"
                        #xsd/langString "Exif Version@en"],
   :rdfs/label         #xsd/langString "ExifVersion@en",
   :rdfs/subPropertyOf [:exif/versionInfo :exif/exifAttribute]})

(def exif_IFD_Pointer
  "Exif IFD Pointer"
  {:db/ident :exif/exif_IFD_Pointer,
   :exif/tagNumber #xsd/langString "34665@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "Exif IFDへのポインタ@ja"
    #xsd/langString
     "A pointer to the Exif IFD, which is a set of tags for recording Exif-specific attribute information.@en"],
   :rdfs/label #xsd/langString "Exif IFD Pointer@en",
   :rdfs/subPropertyOf [:exif/ifdPointer :exif/exifAttribute]})

(def exifdata
  "An Exif IFD data entry"
  {:db/ident     :exif/exifdata,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString "An Exif IFD data entry@en",
   :rdfs/label   #xsd/langString "Exif data@en"})

(def exposureBiasValue
  "ExposureBiasValue"
  {:db/ident :exif/exposureBiasValue,
   :exif/tagNumber #xsd/langString "37380@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "撮影時の露光補正量。単位はAPEX値(EV)@ja"
    #xsd/langString
     "The exposure bias. The unit is the APEX value. Ordinarily it is given in the range of -99.99 to 99.99.@en"],
   :rdfs/label #xsd/langString "ExposureBiasValue@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def exposureIndex
  "ExposureIndex"
  {:db/ident :exif/exposureIndex,
   :exif/tagNumber #xsd/langString "41493@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "CCD感度。データ形式が符号なし分数である事を除き、ISOSpeedRatingsと同じ@ja"
    #xsd/langString
     "The exposure index selected on the camera or input device at the time the image is captured.@en"],
   :rdfs/label #xsd/langString "ExposureIndex@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def exposureMode
  "ExposureMode"
  {:db/ident :exif/exposureMode,
   :exif/tagNumber #xsd/langString "41986@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "露光モード@ja"
    #xsd/langString
     "the exposure mode set when the image was shot. In auto-bracketing mode, the camera shoots a series of frames of the same scene at different exposure settings.@en"],
   :rdfs/label #xsd/langString "ExposureMode@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def exposureProgram
  "ExposureProgram"
  {:db/ident :exif/exposureProgram,
   :exif/tagNumber #xsd/langString "34850@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "露光制御のモード@ja"
    #xsd/langString
     "The class of the program used by the camera to set exposure when the picture is taken.@en"],
   :rdfs/label #xsd/langString "ExposureProgram@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def exposureTime
  "ExposureTime"
  {:db/ident           :exif/exposureTime,
   :exif/tagNumber     #xsd/langString "33434@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#xsd/langString "露光時間（シャッター速度の逆数）。単位は秒@ja"
                        #xsd/langString
                         "Exposure time, given in seconds (sec).@en"],
   :rdfs/label         #xsd/langString "ExposureTime@en",
   :rdfs/subPropertyOf [:exif/seconds :exif/pictTaking :exif/exifAttribute]})

(def fNumber
  "FNumber"
  {:db/ident           :exif/fNumber,
   :exif/tagNumber     #xsd/langString "33437@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#xsd/langString "レンズのF値@ja"
                        #xsd/langString "F number@en"],
   :rdfs/label         #xsd/langString "FNumber@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def fileSource
  "FileSource"
  {:db/ident :exif/fileSource,
   :exif/tagNumber #xsd/langString "41728@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "画像がどういうデバイスから得られたか。通常3=DSC@ja"
    #xsd/langString
     "The image source. If a DSC recorded the image, this tag value of this tag always be set to 3, indicating that the image was recorded on a DSC.@en"],
   :rdfs/label #xsd/langString "FileSource@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def flash
  "Flash"
  {:db/ident           :exif/flash,
   :exif/tagNumber     #xsd/langString "37385@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#xsd/langString "フラッシュ発光の状態@ja"
                        #xsd/langString
                         "The status of flash when the image was shot.@en"],
   :rdfs/label         #xsd/langString "Flash@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def flashEnergy
  "FlashEnergy"
  {:db/ident :exif/flashEnergy,
   :exif/tagNumber #xsd/langString "41483@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "BCPSによるストロボの強度@ja"
    #xsd/langString
     "The strobe energy at the time the image is captured, as measured in Beam Candle Power Seconds (BCPS).@en"],
   :rdfs/label #xsd/langString "FlashEnergy@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def flashpixVersion
  "The Flashpix format version supported by a FPXR file. If the FPXR function supports Flashpix format Ver. 1.0, this is indicated similarly to ExifVersion by recording \"0100\" as 4-byte ASCII."
  {:db/ident :exif/flashpixVersion,
   :exif/tagNumber #xsd/langString "40960@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The Flashpix format version supported by a FPXR file. If the FPXR function supports Flashpix format Ver. 1.0, this is indicated similarly to ExifVersion by recording \"0100\" as 4-byte ASCII.@en",
   :rdfs/label #xsd/langString "FlashpixVersion@en",
   :rdfs/subPropertyOf [:exif/versionInfo :exif/exifAttribute]})

(def focalLength
  "FocalLength"
  {:db/ident :exif/focalLength,
   :exif/tagNumber #xsd/langString "37386@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "レンズの焦点距離。単位はmm@ja"
    #xsd/langString
     "The actual focal length of the lens, in mm. Conversion is not made to the focal length of a 35 mm film camera.@en"],
   :rdfs/label #xsd/langString "FocalLength@en",
   :rdfs/subPropertyOf
   [:exif/mm :exif/pictTaking :exif/exifAttribute :exif/length]})

(def focalLengthIn35mmFilm
  "FocalLengthIn35mmFilm"
  {:db/ident :exif/focalLengthIn35mmFilm,
   :exif/tagNumber #xsd/langString "41989@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "35mm換算した焦点距離@ja"
    #xsd/langString
     "The equivalent focal length assuming a 35mm film camera, in mm. A value of 0 means the focal length is unknown. Note that this tag differs from the FocalLength tag.@en"],
   :rdfs/label #xsd/langString "FocalLengthIn35mmFilm@en",
   :rdfs/subPropertyOf [:exif/length :exif/pictTaking :exif/exifAttribute]})

(def focalPlaneResolutionUnit
  "FocalPlaneResolutionUnit"
  {:db/ident :exif/focalPlaneResolutionUnit,
   :exif/tagNumber #xsd/langString "41488@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "CCD画素密度の単位@ja"
    #xsd/langString
     "The unit for measuring FocalPlaneXResolution and FocalPlaneYResolution. This value is the same as the ResolutionUnit.@en"],
   :rdfs/label #xsd/langString "FocalPlaneResolutionUnit@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def focalPlaneXResolution
  "FocalPlaneXResolution"
  {:db/ident :exif/focalPlaneXResolution,
   :exif/tagNumber #xsd/langString "41486@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "撮影画像のCCD位置での水平解像度。この値とFocalPlaneYResolution、FocalLengthを使うと、レンズ焦点距離の35mmカメラ換算値が計算できる。例えば200万画素機を使いVGAモードの画像を撮ったような場合はこの値はVGAの解像度でリサンプルされた値になっており、CCDの画素ピッチそのままの値ではないので注意が必要@ja"
    #xsd/langString
     "The number of pixels in the image width (X) direction per FocalPlaneResolutionUnit on the camera focal plane.@en"],
   :rdfs/label #xsd/langString "FocalPlaneXResolution@en",
   :rdfs/subPropertyOf [:exif/resolution :exif/pictTaking :exif/exifAttribute]})

(def focalPlaneYResolution
  "FocalPlaneYResolution"
  {:db/ident :exif/focalPlaneYResolution,
   :exif/tagNumber #xsd/langString "41487@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "撮影画像のCCD位置での垂直解像度@ja"
    #xsd/langString
     "The number of pixels in the image height (Y) direction per FocalPlaneResolutionUnit on the camera focal plane.@en"],
   :rdfs/label #xsd/langString "FocalPlaneYResolution@en",
   :rdfs/subPropertyOf [:exif/resolution :exif/pictTaking :exif/exifAttribute]})

(def gainControl
  "The degree of overall image gain adjustment."
  {:db/ident           :exif/gainControl,
   :exif/tagNumber     #xsd/langString "41991@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "The degree of overall image gain adjustment.@en",
   :rdfs/label         #xsd/langString "GainControl@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def geo
  "Geometric data such as latitude, longitude and altitude. Usually saved as rational number."
  {:db/ident :exif/geo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Geometric data such as latitude, longitude and altitude. Usually saved as rational number.@en",
   :rdfs/label #xsd/langString "Geometric data@en"})

(def gpsAltitude
  "The altitude based on the reference in GPSAltitudeRef. Altitude is expressed as one RATIONAL value. The reference unit is meters."
  {:db/ident :exif/gpsAltitude,
   :exif/tagNumber #xsd/langString "6@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The altitude based on the reference in GPSAltitudeRef. Altitude is expressed as one RATIONAL value. The reference unit is meters.@en",
   :rdfs/label #xsd/langString "GPSAltitude@en",
   :rdfs/subPropertyOf [:exif/geo :exif/gpsInfo :exif/exifAttribute]})

(def gpsAltitudeRef
  "Indicates the altitude used as the reference altitude. If the reference is sea level and the altitude is above sea level, 0 is given. If the altitude is below sea level, a value of 1 is given and the altitude is indicated as an absolute value in the GPSAltitude tag. The reference unit is meters."
  {:db/ident :exif/gpsAltitudeRef,
   :exif/tagNumber #xsd/langString "5@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Indicates the altitude used as the reference altitude. If the reference is sea level and the altitude is above sea level, 0 is given. If the altitude is below sea level, a value of 1 is given and the altitude is indicated as an absolute value in the GPSAltitude tag. The reference unit is meters.@en",
   :rdfs/label #xsd/langString "GPSAltitudeRef@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsAreaInformation
  "A character string recording the name of the GPS area. The first byte indicates the character code used, and this is followed by the name of the GPS area."
  {:db/ident :exif/gpsAreaInformation,
   :exif/tagNumber #xsd/langString "28@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A character string recording the name of the GPS area. The first byte indicates the character code used, and this is followed by the name of the GPS area.@en",
   :rdfs/label #xsd/langString "GPSAreaInformation@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsDOP
  "The GPS DOP (data degree of precision). An HDOP value is written during two-dimensional measurement, and PDOP during three-dimensional measurement."
  {:db/ident :exif/gpsDOP,
   :exif/tagNumber #xsd/langString "11@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The GPS DOP (data degree of precision). An HDOP value is written during two-dimensional measurement, and PDOP during three-dimensional measurement.@en",
   :rdfs/label #xsd/langString "GPSDOP@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsDateStamp
  "date and time information relative to UTC (Coordinated Universal Time). The record format is \"YYYY:MM:DD\" while converted to W3C-DTF to use in RDF"
  {:db/ident :exif/gpsDateStamp,
   :exif/tagNumber #xsd/langString "29@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "date and time information relative to UTC (Coordinated Universal Time). The record format is \"YYYY:MM:DD\" while converted to W3C-DTF to use in RDF@en",
   :rdfs/label #xsd/langString "GPSDateStamp@en",
   :rdfs/subPropertyOf
   [:exif/date :exif/gpsInfo :dc11/date :exif/exifAttribute]})

(def gpsDestBearing
  "The bearing to the destination point. The range of values is from 0.00 to 359.99."
  {:db/ident :exif/gpsDestBearing,
   :exif/tagNumber #xsd/langString "24@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The bearing to the destination point. The range of values is from 0.00 to 359.99.@en",
   :rdfs/label #xsd/langString "GPSDestBearing@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsDestBearingRef
  "Indicates the reference used for giving the bearing to the destination point. 'T' denotes true direction and 'M' is magnetic direction."
  {:db/ident :exif/gpsDestBearingRef,
   :exif/tagNumber #xsd/langString "23@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Indicates the reference used for giving the bearing to the destination point. 'T' denotes true direction and 'M' is magnetic direction.@en",
   :rdfs/label #xsd/langString "GPSDestBearingRef@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsDestDistance
  "The distance to the destination point."
  {:db/ident           :exif/gpsDestDistance,
   :exif/tagNumber     #xsd/langString "26@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "The distance to the destination point.@en",
   :rdfs/label         #xsd/langString "GPSDestDistance@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsDestDistanceRef
  "Indicates the unit used to express the distance to the destination point. 'K', 'M' and 'N' represent kilometers, miles and knots."
  {:db/ident :exif/gpsDestDistanceRef,
   :exif/tagNumber #xsd/langString "25@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Indicates the unit used to express the distance to the destination point. 'K', 'M' and 'N' represent kilometers, miles and knots.@en",
   :rdfs/label #xsd/langString "GPSDestDistanceRef@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsDestLatitude
  "Latitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively."
  {:db/ident :exif/gpsDestLatitude,
   :exif/tagNumber #xsd/langString "20@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Latitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively.@en",
   :rdfs/label #xsd/langString "GPSDestLatitude@en",
   :rdfs/subPropertyOf [:exif/geo :exif/gpsInfo :exif/exifAttribute]})

(def gpsDestLatitudeRef
  "Reference for latitude of destination"
  {:db/ident           :exif/gpsDestLatitudeRef,
   :exif/tagNumber     #xsd/langString "19@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "Reference for latitude of destination@en",
   :rdfs/label         #xsd/langString "GPSDestLatitudeRef@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsDestLongitude
  "Longitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively."
  {:db/ident :exif/gpsDestLongitude,
   :exif/tagNumber #xsd/langString "22@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Longitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively.@en",
   :rdfs/label #xsd/langString "GPSDestLongitude@en",
   :rdfs/subPropertyOf [:exif/geo :exif/gpsInfo :exif/exifAttribute]})

(def gpsDestLongitudeRef
  "Reference for longitude of destination"
  {:db/ident           :exif/gpsDestLongitudeRef,
   :exif/tagNumber     #xsd/langString "21@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "Reference for longitude of destination@en",
   :rdfs/label         #xsd/langString "GPSDestLongitudeRef@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsDifferential
  "Indicates whether differential correction is applied to the GPS receiver."
  {:db/ident :exif/gpsDifferential,
   :exif/tagNumber #xsd/langString "30@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Indicates whether differential correction is applied to the GPS receiver.@en",
   :rdfs/label #xsd/langString "GPSDifferential@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsImgDirection
  "The direction of the image when it was captured. The range of values is from 0.00 to 359.99."
  {:db/ident :exif/gpsImgDirection,
   :exif/tagNumber #xsd/langString "17@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The direction of the image when it was captured. The range of values is from 0.00 to 359.99.@en",
   :rdfs/label #xsd/langString "GPSImgDirection@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsImgDirectionRef
  "The reference for giving the direction of the image when it is captured. 'T' denotes true direction and 'M' is magnetic direction."
  {:db/ident :exif/gpsImgDirectionRef,
   :exif/tagNumber #xsd/langString "16@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The reference for giving the direction of the image when it is captured. 'T' denotes true direction and 'M' is magnetic direction.@en",
   :rdfs/label #xsd/langString "GPSImgDirectionRef@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsInfo
  "An attribute relating to GPS information"
  {:db/ident           :exif/gpsInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "An attribute relating to GPS information@en",
   :rdfs/label         #xsd/langString "GPS Info@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def gpsInfo_IFD_Pointer
  "GPSInfo IFD Pointer"
  {:db/ident :exif/gpsInfo_IFD_Pointer,
   :exif/tagNumber #xsd/langString "34853@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "GPS IFDへのポインタ@ja"
    #xsd/langString
     "A pointer to the GPS IFD, which is a set of tags for recording GPS information.@en"],
   :rdfs/label #xsd/langString "GPSInfo IFD Pointer@en",
   :rdfs/subPropertyOf [:exif/ifdPointer :exif/exifAttribute]})

(def gpsLatitude
  "GPSLatitude"
  {:db/ident :exif/gpsLatitude,
   :exif/tagNumber #xsd/langString "2@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "緯度@ja"
    #xsd/langString
     "The latitude, expressed as three values giving the degrees, minutes, and seconds, respectively.@en"],
   :rdfs/label #xsd/langString "GPSLatitude@en",
   :rdfs/subPropertyOf [:exif/geo :exif/gpsInfo :exif/exifAttribute]})

(def gpsLatitudeRef
  "GPSLatitudeRef"
  {:db/ident :exif/gpsLatitudeRef,
   :exif/tagNumber #xsd/langString "1@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "緯度の北緯もしくは南緯@ja"
    #xsd/langString
     "Indicates whether the latitude is north or south latitude. The ASCII value 'N' indicates north latitude, and 'S' is south latitude.@en"],
   :rdfs/label #xsd/langString "GPSLatitudeRef@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsLongitude
  "GPSLongitude"
  {:db/ident :exif/gpsLongitude,
   :exif/tagNumber #xsd/langString "4@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "経度@ja"
    #xsd/langString
     "The longitude, expressed as three values giving the degrees, minutes, and seconds, respectively.@en"],
   :rdfs/label #xsd/langString "GPSLongitude@en",
   :rdfs/subPropertyOf [:exif/geo :exif/gpsInfo :exif/exifAttribute]})

(def gpsLongitudeRef
  "GPSLongitudeRef"
  {:db/ident :exif/gpsLongitudeRef,
   :exif/tagNumber #xsd/langString "3@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "経度の東経もしくは西経@ja"
    #xsd/langString
     "Indicates whether the longitude is east or west longitude. ASCII 'E' indicates east longitude, and 'W' is west longitude.@en"],
   :rdfs/label #xsd/langString "GPSLongitudeRef@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsMapDatum
  "GPSMapDatum"
  {:db/ident :exif/gpsMapDatum,
   :exif/tagNumber #xsd/langString "18@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "測地系。日本なら'TOKYO'もしくは'WGS-84'@ja"
    #xsd/langString
     "The geodetic survey data used by the GPS receiver. If the survey data is restricted to Japan, the value of this tag is 'TOKYO' or 'WGS-84'. If a GPS Info tag is recorded, it is strongly recommended that this tag be recorded.@en"],
   :rdfs/label #xsd/langString "GPSMapDatum@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsMeasureMode
  "The GPS measurement mode. '2' means two-dimensional measurement and '3' means three-dimensional measurement is in progress."
  {:db/ident :exif/gpsMeasureMode,
   :exif/tagNumber #xsd/langString "10@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The GPS measurement mode. '2' means two-dimensional measurement and '3' means three-dimensional measurement is in progress.@en",
   :rdfs/label #xsd/langString "GPSMeasureMode@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsProcessingMethod
  "A character string recording the name of the method used for location finding. The first byte indicates the character code used, and this is followed by the name of the method."
  {:db/ident :exif/gpsProcessingMethod,
   :exif/tagNumber #xsd/langString "27@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A character string recording the name of the method used for location finding. The first byte indicates the character code used, and this is followed by the name of the method.@en",
   :rdfs/label #xsd/langString "GPSProcessingMethod@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsSatellites
  "The GPS satellites used for measurements. This tag can be used to describe the number of satellites, their ID number, angle of elevation, azimuth, SNR and other information in ASCII notation. The format is not specified. If the GPS receiver is incapable of taking measurements, value of the tag shall be set to NULL."
  {:db/ident :exif/gpsSatellites,
   :exif/tagNumber #xsd/langString "8@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The GPS satellites used for measurements. This tag can be used to describe the number of satellites, their ID number, angle of elevation, azimuth, SNR and other information in ASCII notation. The format is not specified. If the GPS receiver is incapable of taking measurements, value of the tag shall be set to NULL.@en",
   :rdfs/label #xsd/langString "GPSSatellites@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsSpeed
  "The speed of GPS receiver movement."
  {:db/ident           :exif/gpsSpeed,
   :exif/tagNumber     #xsd/langString "13@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "The speed of GPS receiver movement.@en",
   :rdfs/label         #xsd/langString "GPSSpeed@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsSpeedRef
  "The unit used to express the GPS receiver speed of movement. 'K' 'M' and 'N' represents kilometers per hour, miles per hour, and knots."
  {:db/ident :exif/gpsSpeedRef,
   :exif/tagNumber #xsd/langString "12@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The unit used to express the GPS receiver speed of movement. 'K' 'M' and 'N' represents kilometers per hour, miles per hour, and knots.@en",
   :rdfs/label #xsd/langString "GPSSpeedRef@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsStatus
  "The status of the GPS receiver when the image is recorded. 'A' means measurement is in progress, and 'V' means the measurement is Interoperability."
  {:db/ident :exif/gpsStatus,
   :exif/tagNumber #xsd/langString "9@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The status of the GPS receiver when the image is recorded. 'A' means measurement is in progress, and 'V' means the measurement is Interoperability.@en",
   :rdfs/label #xsd/langString "GPSStatus@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsTimeStamp
  "The time as UTC (Coordinated Universal Time). TimeStamp is expressed as three RATIONAL values giving the hour, minute, and second."
  {:db/ident :exif/gpsTimeStamp,
   :exif/tagNumber #xsd/langString "7@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The time as UTC (Coordinated Universal Time). TimeStamp is expressed as three RATIONAL values giving the hour, minute, and second.@en",
   :rdfs/label #xsd/langString "GPSTimeStamp@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsTrack
  "The direction of GPS receiver movement. The range of values is from 0.00 to 359.99."
  {:db/ident :exif/gpsTrack,
   :exif/tagNumber #xsd/langString "15@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The direction of GPS receiver movement. The range of values is from 0.00 to 359.99.@en",
   :rdfs/label #xsd/langString "GPSTrack@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsTrackRef
  "The reference for giving the direction of GPS receiver movement. 'T' denotes true direction and 'M' is magnetic direction."
  {:db/ident :exif/gpsTrackRef,
   :exif/tagNumber #xsd/langString "14@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The reference for giving the direction of GPS receiver movement. 'T' denotes true direction and 'M' is magnetic direction.@en",
   :rdfs/label #xsd/langString "GPSTrackRef@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/exifAttribute]})

(def gpsVersionID
  "The version of GPSInfoIFD. The version is given as 2.2.0.0. This tag is mandatory when GPSInfo tag is present."
  {:db/ident :exif/gpsVersionID,
   :exif/tagNumber #xsd/langString "0@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The version of GPSInfoIFD. The version is given as 2.2.0.0. This tag is mandatory when GPSInfo tag is present.@en",
   :rdfs/label #xsd/langString "GPSVersionID@en",
   :rdfs/subPropertyOf [:exif/versionInfo :exif/gpsInfo :exif/exifAttribute]})

(def height
  "Height of an object"
  {:db/ident           :exif/height,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "Height of an object@en",
   :rdfs/label         #xsd/langString "Height@en",
   :rdfs/subPropertyOf :exif/length})

(def ifdPointer
  "A tag that refers a child IFD"
  {:db/ident           :exif/ifdPointer,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "A tag that refers a child IFD@en",
   :rdfs/label         #xsd/langString "IFD Pointer@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def imageConfig
  "An attribute relating to Image Configuration"
  {:db/ident           :exif/imageConfig,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "An attribute relating to Image Configuration@en",
   :rdfs/label         #xsd/langString "Image Config@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def imageDataCharacter
  "An attribute relating to image data characteristics"
  {:db/ident :exif/imageDataCharacter,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/langString
                  "An attribute relating to image data characteristics@en",
   :rdfs/label #xsd/langString "Image Data Character@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def imageDataStruct
  "An attribute relating to image data structure"
  {:db/ident           :exif/imageDataStruct,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "An attribute relating to image data structure@en",
   :rdfs/label         #xsd/langString "Image Data Structure@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def imageDescription
  "ImageDescription"
  {:db/ident :exif/imageDescription,
   :exif/tagNumber #xsd/langString "270@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "この画像についての説明。漢字等の2バイト文字の使用は禁止@ja"
    #xsd/langString
     "A character string giving the title of the image. It may be a comment such as \"1988 company picnic\" or the like. Two-byte character codes cannot be used. When a 2-byte code is necessary, the Exif Private tag UserComment is to be used.@en"],
   :rdfs/label #xsd/langString "ImageDescription@en",
   :rdfs/subPropertyOf [:dc11/title :exif/exifAttribute]})

(def imageLength
  "Image height. The number of rows of image data. In JPEG compressed data a JPEG marker is used."
  {:db/ident :exif/imageLength,
   :exif/tagNumber #xsd/langString "257@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Image height. The number of rows of image data. In JPEG compressed data a JPEG marker is used.@en",
   :rdfs/label #xsd/langString "ImageLength@en",
   :rdfs/subPropertyOf
   [:exif/height :exif/imageDataStruct :exif/exifAttribute :exif/length]})

(def imageUniqueID
  "An identifier assigned uniquely to each image. It is recorded as an ASCII string equivalent to hexadecimal notation and 128-bit fixed length."
  {:db/ident :exif/imageUniqueID,
   :exif/tagNumber #xsd/langString "42016@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An identifier assigned uniquely to each image. It is recorded as an ASCII string equivalent to hexadecimal notation and 128-bit fixed length.@en",
   :rdfs/label #xsd/langString "ImageUniqueID@en",
   :rdfs/subPropertyOf [:dc11/identifier :exif/exifAttribute]})

(def imageWidth
  "Image width. The number of columns of image data, equal to the number of pixels per row. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/imageWidth,
   :exif/tagNumber #xsd/langString "256@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Image width. The number of columns of image data, equal to the number of pixels per row. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #xsd/langString "ImageWidth@en",
   :rdfs/subPropertyOf
   [:exif/width :exif/imageDataStruct :exif/exifAttribute :exif/length]})

(def interopInfo
  "An attribute relating to Interoperability. Tags stored in\nInteroperability IFD may be defined dependently to each Interoperability rule."
  {:db/ident :exif/interopInfo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An attribute relating to Interoperability. Tags stored in\nInteroperability IFD may be defined dependently to each Interoperability rule.@en",
   :rdfs/label #xsd/langString "Interoperability Info@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def interoperabilityIndex
  "InteroperabilityIndex"
  {:db/ident :exif/interoperabilityIndex,
   :exif/tagNumber #xsd/langString "1@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "メイン画像のInteroperability IFDで、データの内容がExifR98 v1.0準拠の場合は、'R98'の文字列。サムネィル画像のInteroperability IFDの場合は、'THM'の文字列@ja"
    #xsd/langString
     "Indicates the identification of the Interoperability rule. 'R98' = conforming to R98 file specification of Recommended Exif Interoperability Rules (ExifR98) or to DCF basic file stipulated by Design Rule for Camera File System. 'THM' = conforming to DCF thumbnail file stipulated by Design rule for Camera File System.@en"],
   :rdfs/label #xsd/langString "InteroperabilityIndex@en",
   :rdfs/subPropertyOf [:exif/interopInfo :exif/exifAttribute]})

(def interoperabilityVersion
  "InteroperabilityVersion"
  {:db/ident           :exif/interoperabilityVersion,
   :exif/tagNumber     #xsd/langString "2@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#xsd/langString
                         "データの内容がExifR98 v1.0準拠の場合は、'0100'の文字列。@ja"
                        #xsd/langString "Interoperability Version@en"],
   :rdfs/label         #xsd/langString "InteroperabilityVersion@en",
   :rdfs/subPropertyOf [:exif/interopInfo :exif/exifAttribute]})

(def interoperability_IFD_Pointer
  "Interoperability IFD Pointer"
  {:db/ident :exif/interoperability_IFD_Pointer,
   :exif/tagNumber #xsd/langString "40965@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "Interoperability IFDへのポインタ@ja"
    #xsd/langString
     "A pointer to the Interoperability IFD, which is composed of tags storing the information to ensure the Interoperability@en"],
   :rdfs/label #xsd/langString "Interoperability IFD Pointer@en",
   :rdfs/subPropertyOf [:exif/ifdPointer :exif/exifAttribute]})

(def isoSpeedRatings
  "ISOSpeedRatings"
  {:db/ident :exif/isoSpeedRatings,
   :exif/tagNumber #xsd/langString "34855@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "CCD感度の銀塩フィルム換算値@ja"
    #xsd/langString
     "Indicates the ISO Speed and ISO Latitude of the camera or input device as specified in ISO 12232.@en"],
   :rdfs/label #xsd/langString "ISOSpeedRatings@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def jpegInterchangeFormat
  "JPEGInterchangeFormat"
  {:db/ident :exif/jpegInterchangeFormat,
   :exif/tagNumber #xsd/langString "513@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "圧縮されたサムネイルへのオフセット@ja"
    #xsd/langString
     "The offset to the start byte (SOI) of JPEG compressed thumbnail data. This is not used for primary image JPEG data.@en"],
   :rdfs/label #xsd/langString "JPEGInterchangeFormat@en",
   :rdfs/subPropertyOf [:exif/recOffset :exif/exifAttribute]})

(def jpegInterchangeFormatLength
  "JPEGInterchangeFormatLength"
  {:db/ident :exif/jpegInterchangeFormatLength,
   :exif/tagNumber #xsd/langString "514@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "圧縮されたサムネイルのサイズ@ja"
    #xsd/langString
     "The number of bytes of JPEG compressed thumbnail data. This is not used for primary image JPEG data.@en"],
   :rdfs/label #xsd/langString "JPEGInterchangeFormatLength@en",
   :rdfs/subPropertyOf [:exif/recOffset :exif/exifAttribute]})

(def length
  "Length of an object. Could be a subProperty of other general schema."
  {:db/ident :exif/length,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Length of an object. Could be a subProperty of other general schema.@en",
   :rdfs/label #xsd/langString "Length@en"})

(def lightSource
  "LightSource"
  {:db/ident :exif/lightSource,
   :exif/tagNumber #xsd/langString "37384@en",
   :rdf/type :rdf/Property,
   :rdfs/comment [#xsd/langString "光源。これはマニュアルでホワイトバランスを設定した場合のモード値となる@ja"
                  #xsd/langString
                   "Light source such as Daylight, Tungsten, Flash etc.@en"],
   :rdfs/label #xsd/langString "LightSource@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def make
  "Make"
  {:db/ident           :exif/make,
   :exif/tagNumber     #xsd/langString "271@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#xsd/langString "カメラのメーカー名。DCFでは必須@ja"
                        #xsd/langString
                         "Manufacturer of image input equipment@en"],
   :rdfs/label         #xsd/langString "Make@en",
   :rdfs/subPropertyOf [:rdfs/label :exif/exifAttribute]})

(def makerNote
  "MakerNote"
  {:db/ident           :exif/makerNote,
   :exif/tagNumber     #xsd/langString "37500@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#xsd/langString "カメラの内部情報等、メーカー依存データ@ja"
                        #xsd/langString "Manufacturer notes@en"],
   :rdfs/label         #xsd/langString "MakerNote@en",
   :rdfs/subPropertyOf [:exif/userInfo :exif/exifAttribute]})

(def maxApertureValue
  "MaxApertureValue"
  {:db/ident :exif/maxApertureValue,
   :exif/tagNumber #xsd/langString "37381@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "レンズの開放F値。ApertureValue同様、ルート2のベキ乗を取ると通常の絞り値に換算できる@ja"
    #xsd/langString
     "The smallest F number of the lens. The unit is the APEX value. Ordinarily it is given in the range of 00.00 to 99.99, but it is not limited to this range.@en"],
   :rdfs/label #xsd/langString "MaxApertureValue@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def meter
  "A length with unit of meter"
  {:db/ident           :exif/meter,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "A length with unit of meter@en",
   :rdfs/label         #xsd/langString "Meter@en",
   :rdfs/subPropertyOf :exif/length})

(def meteringMode
  "MeteringMode"
  {:db/ident :exif/meteringMode,
   :exif/tagNumber #xsd/langString "37383@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "自動露出の測光モード@ja"
    #xsd/langString
     "Metering mode, such as CenterWeightedAverage, Spot, MultiSpot,Pattern, Partial etc.@en"],
   :rdfs/label #xsd/langString "MeteringMode@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def mm
  "A length with unit of mm"
  {:db/ident           :exif/mm,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "A length with unit of mm@en",
   :rdfs/label         #xsd/langString "Milimeter@en",
   :rdfs/subPropertyOf :exif/length})

(def model
  "Model"
  {:db/ident           :exif/model,
   :exif/tagNumber     #xsd/langString "272@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#xsd/langString "カメラの機種名。DCFでは必須@ja"
                        #xsd/langString "Model of image input equipment@en"],
   :rdfs/label         #xsd/langString "Model@en",
   :rdfs/subPropertyOf [:rdfs/label :exif/exifAttribute]})

(def oecf
  "Indicates the Opto-Electric Conversion Function (OECF) specified in ISO 14524. OECF is the relationship between the camera optical input and the image values."
  {:db/ident :exif/oecf,
   :exif/tagNumber #xsd/langString "34856@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Indicates the Opto-Electric Conversion Function (OECF) specified in ISO 14524. OECF is the relationship between the camera optical input and the image values.@en",
   :rdfs/label #xsd/langString "OECF@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def orientation
  "Orientation"
  {:db/ident :exif/orientation,
   :exif/tagNumber #xsd/langString "274@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "画像データがどこ(top-leftなど）を起点として、どの向きで格納されているか@ja"
    #xsd/langString
     "The image orientation viewed in terms of rows and columns.@en"],
   :rdfs/label #xsd/langString "Orientation@en",
   :rdfs/subPropertyOf [:exif/imageDataStruct :exif/exifAttribute]})

(def photometricInterpretation
  "Pixel composition. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/photometricInterpretation,
   :exif/tagNumber #xsd/langString "262@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Pixel composition. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #xsd/langString "PhotometricInterpretation@en",
   :rdfs/subPropertyOf [:exif/imageDataStruct :exif/exifAttribute]})

(def pictTaking
  "An attribute relating to Picture-Taking Conditions"
  {:db/ident           :exif/pictTaking,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "An attribute relating to Picture-Taking Conditions@en",
   :rdfs/label         #xsd/langString "PictTaking@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def pimBrightness
  "Brightness info for print image matching"
  {:db/ident           :exif/pimBrightness,
   :exif/tagNumber     #xsd/langString "10@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "Brightness info for print image matching@en",
   :rdfs/label         #xsd/langString "PrintIM Brightness@en",
   :rdfs/subPropertyOf [:exif/pimInfo :exif/exifAttribute]})

(def pimColorBalance
  "ColorBalance info for print image matching"
  {:db/ident           :exif/pimColorBalance,
   :exif/tagNumber     #xsd/langString "11@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "ColorBalance info for print image matching@en",
   :rdfs/label         #xsd/langString "PrintIM ColorBalance@en",
   :rdfs/subPropertyOf [:exif/pimInfo :exif/exifAttribute]})

(def pimContrast
  "Contrast info for print image matching"
  {:db/ident           :exif/pimContrast,
   :exif/tagNumber     #xsd/langString "9@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "Contrast info for print image matching@en",
   :rdfs/label         #xsd/langString "PrintIM Contrast@en",
   :rdfs/subPropertyOf [:exif/pimInfo :exif/exifAttribute]})

(def pimInfo
  "An attribute relating to print image matching"
  {:db/ident           :exif/pimInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "An attribute relating to print image matching@en",
   :rdfs/label         #xsd/langString "PIM Info@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def pimSaturation
  "Saturation info for print image matching"
  {:db/ident           :exif/pimSaturation,
   :exif/tagNumber     #xsd/langString "12@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "Saturation info for print image matching@en",
   :rdfs/label         #xsd/langString "PrintIM Saturation@en",
   :rdfs/subPropertyOf [:exif/pimInfo :exif/exifAttribute]})

(def pimSharpness
  "Sharpness info for print image matching"
  {:db/ident           :exif/pimSharpness,
   :exif/tagNumber     #xsd/langString "13@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "Sharpness info for print image matching@en",
   :rdfs/label         #xsd/langString "PrintIM Sharpness@en",
   :rdfs/subPropertyOf [:exif/pimInfo :exif/exifAttribute]})

(def pixelXDimension
  "Information specific to compressed data. When a compressed file is recorded, the valid width of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file."
  {:db/ident :exif/pixelXDimension,
   :exif/tagNumber #xsd/langString "40962@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Information specific to compressed data. When a compressed file is recorded, the valid width of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file.@en",
   :rdfs/label #xsd/langString "PixelXDimension@en",
   :rdfs/subPropertyOf
   [:exif/width :exif/imageConfig :exif/exifAttribute :exif/length]})

(def pixelYDimension
  "Information specific to compressed data. When a compressed file is recorded, the valid height of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file. Since data padding is unnecessary in the vertical direction, the number of lines recorded in this valid image height tag will in fact be the same as that recorded in the SOF."
  {:db/ident :exif/pixelYDimension,
   :exif/tagNumber #xsd/langString "40963@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Information specific to compressed data. When a compressed file is recorded, the valid height of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file. Since data padding is unnecessary in the vertical direction, the number of lines recorded in this valid image height tag will in fact be the same as that recorded in the SOF.@en",
   :rdfs/label #xsd/langString "PixelYDimension@en",
   :rdfs/subPropertyOf
   [:exif/height :exif/imageConfig :exif/exifAttribute :exif/length]})

(def planarConfiguration
  "Indicates whether pixel components are recorded in chunky or planar format. In JPEG compressed files a JPEG marker is used instead of this tag. If this field does not exist, the TIFF default of 1 (chunky) is assumed."
  {:db/ident :exif/planarConfiguration,
   :exif/tagNumber #xsd/langString "284@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Indicates whether pixel components are recorded in chunky or planar format. In JPEG compressed files a JPEG marker is used instead of this tag. If this field does not exist, the TIFF default of 1 (chunky) is assumed.@en",
   :rdfs/label #xsd/langString "PlanarConfiguration@en",
   :rdfs/subPropertyOf [:exif/imageDataStruct :exif/exifAttribute]})

(def primaryChromaticities
  "PrimaryChromaticities"
  {:db/ident :exif/primaryChromaticities,
   :exif/tagNumber #xsd/langString "319@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "原色の色度。CCIR REcommendation 709 primariesを使っている場合は、'640/1000,330/1000,300/1000,600/1000,150/1000,60/1000'という値。通常はColorSpaceタグがあるので不要@ja"
    #xsd/langString
     "The chromaticity of the three primary colors of the image. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace).@en"],
   :rdfs/label #xsd/langString "PrimaryChromaticities@en",
   :rdfs/subPropertyOf [:exif/imageDataCharacter :exif/exifAttribute]})

(def printImageMatching_IFD_Pointer
  "A pointer to the print image matching IFD"
  {:db/ident           :exif/printImageMatching_IFD_Pointer,
   :exif/tagNumber     #xsd/langString "50341@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "A pointer to the print image matching IFD@en",
   :rdfs/label         #xsd/langString "PrintImageMatching IFD Pointer@en",
   :rdfs/subPropertyOf [:exif/ifdPointer :exif/exifAttribute]})

(def recOffset
  "An attribute relating to recording offset"
  {:db/ident           :exif/recOffset,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "An attribute relating to recording offset@en",
   :rdfs/label         #xsd/langString "Recording Offset@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def referenceBlackWhite
  "ReferenceBlackWhite"
  {:db/ident :exif/referenceBlackWhite,
   :exif/tagNumber #xsd/langString "532@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "画像情報の黒点・白点値。YCbCr形式の場合、最初の２つの値がY(輝度)の黒点・白点、次がCb、最後がCrとなり、デフォルト値は'0,255,0,128,0,128'。RGB形式の場合はR、G、Bの順で黒点・白点値が並んでおり、デフォルト値は'0,255,0,255,0,255'。@ja"
    #xsd/langString
     "The reference black point value and reference white point value. The color space is declared in a color space information tag, with the default being the value that gives the optimal image characteristics Interoperability these conditions.@en"],
   :rdfs/label #xsd/langString "ReferenceBlackWhite@en",
   :rdfs/subPropertyOf [:exif/imageDataCharacter :exif/exifAttribute]})

(def relatedFile
  "Tag Relating to Related File Information"
  {:db/ident           :exif/relatedFile,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "Tag Relating to Related File Information@en",
   :rdfs/label         #xsd/langString "Related File@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def relatedImageFileFormat
  "RelatedImageFileFormat"
  {:db/ident :exif/relatedImageFileFormat,
   :exif/tagNumber #xsd/langString "4096@en",
   :rdf/type :rdf/Property,
   :rdfs/comment [#xsd/langString
                   "画像フォーマットを'Exif JPEG Ver. 2.1'などの文字列で示す。通常はサムネィル画像に使う@ja"
                  #xsd/langString "Related image file format@en"],
   :rdfs/label #xsd/langString "RelatedImageFileFormat@en",
   :rdfs/subPropertyOf [:exif/interopInfo :exif/exifAttribute]})

(def relatedImageLength
  "RelatedImageLength"
  {:db/ident           :exif/relatedImageLength,
   :exif/tagNumber     #xsd/langString "4098@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#xsd/langString
                         "画像高。通常はサムネイル画像のInteroperability IFDに使う@ja"
                        #xsd/langString "Related image length@en"],
   :rdfs/label         #xsd/langString "RelatedImageLength@en",
   :rdfs/subPropertyOf [:exif/height
                        :exif/interopInfo
                        :exif/exifAttribute
                        :exif/length]})

(def relatedImageWidth
  "RelatedImageWidth"
  {:db/ident           :exif/relatedImageWidth,
   :exif/tagNumber     #xsd/langString "4097@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#xsd/langString
                         "画像幅。通常はサムネイル画像のInteroperability IFDに使う@ja"
                        #xsd/langString "Related image width@en"],
   :rdfs/label         #xsd/langString "RelatedImageWidth@en",
   :rdfs/subPropertyOf [:exif/width
                        :exif/interopInfo
                        :exif/exifAttribute
                        :exif/length]})

(def relatedSoundFile
  "RelatedSoundFile"
  {:db/ident           :exif/relatedSoundFile,
   :exif/tagNumber     #xsd/langString "40964@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#xsd/langString "画像と一緒に音声録音できる機種の場合に、音声ファイルの名前@ja"
                        #xsd/langString "Related audio file@en"],
   :rdfs/label         #xsd/langString "RelatedSoundFile@en",
   :rdfs/subPropertyOf [:exif/relatedFile :exif/exifAttribute]})

(def resolution
  "a rational number representing a resolution. Could be a subProperty of other general schema."
  {:db/ident :exif/resolution,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "a rational number representing a resolution. Could be a subProperty of other general schema.@en",
   :rdfs/label #xsd/langString "Resolution@en"})

(def resolutionUnit
  "ResolutionUnit"
  {:db/ident :exif/resolutionUnit,
   :exif/tagNumber #xsd/langString "296@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "XResolution/YResolutionの解像度の単位@ja"
    #xsd/langString
     "The unit for measuring XResolution and YResolution. The same unit is used for both XResolution and YResolution. If the image resolution in unknown, 2 (inches) is designated.@en"],
   :rdfs/label #xsd/langString "ResolutionUnit@en",
   :rdfs/subPropertyOf [:exif/imageDataStruct :exif/exifAttribute]})

(def rowsPerStrip
  "The number of rows per strip. This is the number of rows in the image of one strip when an image is divided into strips. With JPEG compressed data this designation is not needed and is omitted."
  {:db/ident :exif/rowsPerStrip,
   :exif/tagNumber #xsd/langString "278@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The number of rows per strip. This is the number of rows in the image of one strip when an image is divided into strips. With JPEG compressed data this designation is not needed and is omitted.@en",
   :rdfs/label #xsd/langString "RowsPerStrip@en",
   :rdfs/subPropertyOf [:exif/recOffset :exif/exifAttribute]})

(def samplesPerPixel
  "The number of components per pixel. Since this standard applies to RGB and YCbCr images, the value set for this tag is 3. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/samplesPerPixel,
   :exif/tagNumber #xsd/langString "277@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The number of components per pixel. Since this standard applies to RGB and YCbCr images, the value set for this tag is 3. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #xsd/langString "SamplesPerPixel@en",
   :rdfs/subPropertyOf [:exif/imageDataStruct :exif/exifAttribute]})

(def saturation
  "The direction of saturation processing applied by the camera when the image was shot."
  {:db/ident :exif/saturation,
   :exif/tagNumber #xsd/langString "41993@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The direction of saturation processing applied by the camera when the image was shot.@en",
   :rdfs/label #xsd/langString "Saturation@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def sceneCaptureType
  "The type of scene that was shot. It can also be used to record the mode in which the image was shot, such as Landscape, Portrait etc. Note that this differs from the scene type (SceneType) tag."
  {:db/ident :exif/sceneCaptureType,
   :exif/tagNumber #xsd/langString "41990@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The type of scene that was shot. It can also be used to record the mode in which the image was shot, such as Landscape, Portrait etc. Note that this differs from the scene type (SceneType) tag.@en",
   :rdfs/label #xsd/langString "SceneCaptureType@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def sceneType
  "SceneType"
  {:db/ident :exif/sceneType,
   :exif/tagNumber #xsd/langString "41729@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "画像がどうやって撮られたか。デジカメの場合は通常1=A directly photographed image@ja"
    #xsd/langString
     "The type of scene. If a DSC recorded the image, this tag value shall always be set to 1, indicating that the image was directly photographed.@en"],
   :rdfs/label #xsd/langString "SceneType@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def seconds
  "a mesurement of time length with unit of second"
  {:db/ident     :exif/seconds,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString
                  "a mesurement of time length with unit of second@en",
   :rdfs/label   #xsd/langString "Seconds@en"})

(def sensingMethod
  "SensingMethod"
  {:db/ident :exif/sensingMethod,
   :exif/tagNumber #xsd/langString "41495@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "イメージセンサーの形式。One-chip color area sensor、Color sequential area sensor、Trilinear sensorなど@ja"
    #xsd/langString
     "The image sensor type on the camera or input device, such as One-chip color area sensor etc.@en"],
   :rdfs/label #xsd/langString "SensingMethod@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def sharpness
  "The direction of sharpness processing applied by the camera when the image was shot."
  {:db/ident :exif/sharpness,
   :exif/tagNumber #xsd/langString "41994@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The direction of sharpness processing applied by the camera when the image was shot.@en",
   :rdfs/label #xsd/langString "Sharpness@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def shutterSpeedValue
  "ShutterSpeedValue"
  {:db/ident :exif/shutterSpeedValue,
   :exif/tagNumber #xsd/langString "37377@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "シャッター速度（APEX値）。この値の2のベキ乗をとって逆数にすると、通常のシャッター速度表示になる。例えば'4'の場合だと1/(2^4)=1/16秒@ja"
    #xsd/langString
     "Shutter speed. The unit is the APEX (Additive System of Photographic Exposure) setting@en"],
   :rdfs/label #xsd/langString "ShutterSpeedValue@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def software
  "Software"
  {:db/ident :exif/software,
   :exif/tagNumber #xsd/langString "305@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "デジカメ（もしくは入力機器）の内蔵ソフトウェア/ファームウェアの名称とバージョン@ja"
    #xsd/langString
     "The name and version of the software or firmware of the camera or image input device used to generate the image.@en"],
   :rdfs/label #xsd/langString "Software@en",
   :rdfs/subPropertyOf [:rdfs/label :exif/exifAttribute]})

(def spatialFrequencyResponse
  "This tag records the camera or input device spatial frequency table and SFR values in the direction of image width, image height, and diagonal direction, as specified in ISO 12233."
  {:db/ident :exif/spatialFrequencyResponse,
   :exif/tagNumber #xsd/langString "41484@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "This tag records the camera or input device spatial frequency table and SFR values in the direction of image width, image height, and diagonal direction, as specified in ISO 12233.@en",
   :rdfs/label #xsd/langString "SpatialFrequencyResponse@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def spectralSensitivity
  "Indicates the spectral sensitivity of each channel of the camera used. The tag value is an ASCII string compatible with the standard developed by the ASTM Technical committee."
  {:db/ident :exif/spectralSensitivity,
   :exif/tagNumber #xsd/langString "34852@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Indicates the spectral sensitivity of each channel of the camera used. The tag value is an ASCII string compatible with the standard developed by the ASTM Technical committee.@en",
   :rdfs/label #xsd/langString "SpectralSensitivity@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def stripByteCounts
  "The total number of bytes in each strip. With JPEG compressed data this designation is not needed and is omitted."
  {:db/ident :exif/stripByteCounts,
   :exif/tagNumber #xsd/langString "279@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The total number of bytes in each strip. With JPEG compressed data this designation is not needed and is omitted.@en",
   :rdfs/label #xsd/langString "StripByteCounts@en",
   :rdfs/subPropertyOf [:exif/recOffset :exif/exifAttribute]})

(def stripOffsets
  "For each strip, the byte offset of that strip. With JPEG compressed data this designation is not needed and is omitted."
  {:db/ident :exif/stripOffsets,
   :exif/tagNumber #xsd/langString "273@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "For each strip, the byte offset of that strip. With JPEG compressed data this designation is not needed and is omitted.@en",
   :rdfs/label #xsd/langString "StripOffsets@en",
   :rdfs/subPropertyOf [:exif/recOffset :exif/exifAttribute]})

(def subSecTime
  "DateTime subseconds"
  {:db/ident           :exif/subSecTime,
   :exif/tagNumber     #xsd/langString "37520@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "DateTime subseconds@en",
   :rdfs/label         #xsd/langString "SubSecTime@en",
   :rdfs/subPropertyOf [:exif/subseconds
                        :exif/dateAndOrTime
                        :exif/exifAttribute]})

(def subSecTimeDigitized
  "DateTimeDigitized subseconds"
  {:db/ident           :exif/subSecTimeDigitized,
   :exif/tagNumber     #xsd/langString "37522@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "DateTimeDigitized subseconds@en",
   :rdfs/label         #xsd/langString "SubSecTimeDigitized@en",
   :rdfs/subPropertyOf [:exif/subseconds
                        :exif/dateAndOrTime
                        :exif/exifAttribute]})

(def subSecTimeOriginal
  "DateTimeOriginal subseconds"
  {:db/ident           :exif/subSecTimeOriginal,
   :exif/tagNumber     #xsd/langString "37521@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "DateTimeOriginal subseconds@en",
   :rdfs/label         #xsd/langString "SubSecTimeOriginal@en",
   :rdfs/subPropertyOf [:exif/subseconds
                        :exif/dateAndOrTime
                        :exif/exifAttribute]})

(def subjectArea
  "SubjectArea"
  {:db/ident :exif/subjectArea,
   :exif/tagNumber #xsd/langString "37396@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "画面中の主たる被写体の位置。2値によるXY座標、3値による円、4値による長方形座標の3通りの示し方がある@ja"
    #xsd/langString
     "The location and area of the main subject in the overall scene.@en"],
   :rdfs/label #xsd/langString "SubjectArea@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def subjectDistance
  "SubjectDistance"
  {:db/ident :exif/subjectDistance,
   :exif/tagNumber #xsd/langString "37382@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "被写体までの距離。単位はm@ja"
    #xsd/langString
     "The distance to the subject, given in meters. Note that if the numerator of the recorded value is FFFFFFFF.H, Infinity shall be indicated; and if the numerator is 0, Distance unknown shall be indicated.@en"],
   :rdfs/label #xsd/langString "SubjectDistance@en",
   :rdfs/subPropertyOf
   [:exif/meter :exif/pictTaking :exif/exifAttribute :exif/length]})

(def subjectDistanceRange
  "The distance to the subject, such as Macro, Close View or Distant View."
  {:db/ident :exif/subjectDistanceRange,
   :exif/tagNumber #xsd/langString "41996@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The distance to the subject, such as Macro, Close View or Distant View.@en",
   :rdfs/label #xsd/langString "SubjectDistanceRange@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def subjectLocation
  "SubjectLocation"
  {:db/ident :exif/subjectLocation,
   :exif/tagNumber #xsd/langString "41492@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "画面中の主要被写体のXY座標@ja"
    #xsd/langString
     "The location of the main subject in the scene. The value of this tag represents the pixel at the center of the main subject relative to the left edge, prior to rotation processing as per the Rotation tag. The first value indicates the X column number and second indicates the Y row number.@en"],
   :rdfs/label #xsd/langString "SubjectLocation@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def subseconds
  "A tag used to record fractions of seconds for a date property"
  {:db/ident :exif/subseconds,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A tag used to record fractions of seconds for a date property@en",
   :rdfs/label #xsd/langString "Subseconds@en"})

(def tag_number
  "The Exif tag number"
  {:db/ident           :exif/tag_number,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "The Exif tag number@en",
   :rdfs/label         #xsd/langString "Tag number@en",
   :rdfs/subPropertyOf :dc11/identifier})

(def tagid
  "The Exif tag number with context prefix, such as IFD type or maker name"
  {:db/ident :exif/tagid,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The Exif tag number with context prefix, such as IFD type or maker name@en",
   :rdfs/label #xsd/langString "Tag ID@en",
   :rdfs/subPropertyOf [:exif/tag_number :dc11/identifier]})

(def transferFunction
  "A transfer function for the image, described in tabular style. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace)."
  {:db/ident :exif/transferFunction,
   :exif/tagNumber #xsd/langString "301@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A transfer function for the image, described in tabular style. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace).@en",
   :rdfs/label #xsd/langString "TransferFunction@en",
   :rdfs/subPropertyOf [:exif/imageDataCharacter :exif/exifAttribute]})

(def userComment
  "UserComment"
  {:db/ident :exif/userComment,
   :exif/tagNumber #xsd/langString "37510@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "ユーザーコメント。ImageDescriptionタグと違って、こちらはJIS2バイトコード、Unicode等での記述が許されており、最初の8バイトが文字コード@ja"
    #xsd/langString
     "A tag for Exif users to write keywords or comments on the image besides those in ImageDescription, and without the character code limitations of the ImageDescription tag. The character code used in the UserComment tag is identified based on an ID code in a fixed 8-byte area at the start of the tag data area.@en"],
   :rdfs/label #xsd/langString "UserComment@en",
   :rdfs/subPropertyOf [:exif/userInfo :exif/exifAttribute]})

(def userInfo
  "An attribute relating to User Information"
  {:db/ident           :exif/userInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "An attribute relating to User Information@en",
   :rdfs/label         #xsd/langString "User Info@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def versionInfo
  "An attribute relating to Version"
  {:db/ident           :exif/versionInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "An attribute relating to Version@en",
   :rdfs/label         #xsd/langString "Version Info@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def whiteBalance
  "WhiteBalance"
  {:db/ident :exif/whiteBalance,
   :exif/tagNumber #xsd/langString "41987@en",
   :rdf/type :rdf/Property,
   :rdfs/comment [#xsd/langString "ホワイトバランスのモード@ja"
                  #xsd/langString
                   "The white balance mode set when the image was shot.@en"],
   :rdfs/label #xsd/langString "WhiteBalance@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/exifAttribute]})

(def whitePoint
  "WhitePoint"
  {:db/ident :exif/whitePoint,
   :exif/tagNumber #xsd/langString "318@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "白点の色度。CIE Standard Illuminant D65(いわゆる昼光色の世界標準値)を使っていれば、'3127/10000,3290/10000'という値。通常はColorSpaceタグがあるので不要@ja"
    #xsd/langString
     "The chromaticity of the white point of the image. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace).@en"],
   :rdfs/label #xsd/langString "WhitePoint@en",
   :rdfs/subPropertyOf [:exif/imageDataCharacter :exif/exifAttribute]})

(def width
  "Width of an object"
  {:db/ident           :exif/width,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "Width of an object@en",
   :rdfs/label         #xsd/langString "Width@en",
   :rdfs/subPropertyOf :exif/length})

(def xResolution
  "XResolution"
  {:db/ident :exif/xResolution,
   :exif/tagNumber #xsd/langString "282@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "画像の表示・印刷時の水平解像度@ja"
    #xsd/langString
     "The number of pixels per ResolutionUnit in the ImageWidth direction. When the image resolution is unknown, 72 [dpi] is designated.@en"],
   :rdfs/label #xsd/langString "XResolution@en",
   :rdfs/subPropertyOf
   [:exif/resolution :exif/imageDataStruct :exif/exifAttribute]})

(def yCbCrCoefficients
  "YCbCrCoefficients"
  {:db/ident :exif/yCbCrCoefficients,
   :exif/tagNumber #xsd/langString "529@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "RGB形式からYCbCr形式に変換するための3つの係数。通常は0.299、0.587、0.114という値@ja"
    #xsd/langString
     "The matrix coefficients for transformation from RGB to YCbCr image data.@en"],
   :rdfs/label #xsd/langString "YCbCrCoefficients@en",
   :rdfs/subPropertyOf [:exif/imageDataCharacter :exif/exifAttribute]})

(def yCbCrPositioning
  "YCbCrPositioning"
  {:db/ident :exif/yCbCrPositioning,
   :exif/tagNumber #xsd/langString "531@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "色情報のサンプリングを間引きしている場合に、色情報のサンプルポイントがどこになるか。1='centered'なら点集合の中央、2＝'co-sited'なら点集合の原点@ja"
    #xsd/langString
     "The position of chrominance components in relation to the luminance component. This field is designated only for JPEG compressed data or uncompressed YCbCr data.@en"],
   :rdfs/label #xsd/langString "YCbCrPositioning@en",
   :rdfs/subPropertyOf [:exif/imageDataStruct :exif/exifAttribute]})

(def yCbCrSubSampling
  "The sampling ratio of chrominance components in relation to the luminance component. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/yCbCrSubSampling,
   :exif/tagNumber #xsd/langString "530@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The sampling ratio of chrominance components in relation to the luminance component. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #xsd/langString "YCbCrSubSampling@en",
   :rdfs/subPropertyOf [:exif/imageDataStruct :exif/exifAttribute]})

(def yResolution
  "YResolution"
  {:db/ident :exif/yResolution,
   :exif/tagNumber #xsd/langString "283@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "画像の表示・印刷時の垂直解像度@ja"
    #xsd/langString
     "The number of pixels per ResolutionUnit in the ImageLength direction. The same value as XResolution is designated.@en"],
   :rdfs/label #xsd/langString "YResolution@en",
   :rdfs/subPropertyOf
   [:exif/resolution :exif/imageDataStruct :exif/exifAttribute]})